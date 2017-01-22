package sort;

import array_list.Array;

import java.util.Scanner;

import static array_list.输出数列.print_arr;
import static sort.BubbleSort.swap;

/**
 * 堆排序
 * 初始时把要排序的n个数的序列看作是一棵顺序存储的二叉树（一维数组存储二叉树），调整它们的存储序，使之成为一个堆，将堆顶元素输出，得到n 个元素中最小(或最大)的元素，这时堆的根节点的数最小（或者最大）。
 * 然后对前面(n-1)个元素重新调整使之成为堆，输出堆顶元素，得到n 个元素中次小(或次大)的元素。依此类推，直到只有两个节点的堆，并对它们作交换，最后得到有n个节点的有序序列。称这个过程为堆排序。
 * 因此，实现堆排序需解决两个问题：
 * 1. 如何将n 个待排序的数建成堆；
 * 2. 输出堆顶元素后，怎样调整剩余n-1 个元素，使其成为一个新堆。
 *
 * 首先讨论第二个问题：输出堆顶元素后，对剩余n-1元素重新建成堆的调整过程。
 * 调整小顶堆的方法：
 * 1）设有m 个元素的堆，输出堆顶元素后，剩下m-1 个元素。将堆底元素送入堆顶（（最后一个元素与堆顶进行交换），堆被破坏，其原因仅是根结点不满足堆的性质。
 * 2）将根结点与左、右子树中较小元素的进行交换。
 * 3）若与左子树交换：如果左子树堆被破坏，即左子树的根结点不满足堆的性质，则重复方法 （2）.
 * 4）若与右子树交换，如果右子树堆被破坏，即右子树的根结点不满足堆的性质。则重复方法 （2）.
 * 5）继续对不满足堆性质的子树进行上述交换操作，直到叶子结点，堆被建成。
 *
 * 再讨论对n 个元素初始建堆的过程。
 * 建堆方法：对初始序列建堆的过程，就是一个反复进行筛选的过程。
 * 1）n 个结点的完全二叉树，则最后一个结点是第个结点的子树。
 * 2）筛选从第个结点为根的子树开始，该子树成为堆。
 * 3）之后向前依次对各结点为根的子树进行筛选，使之成为堆，直到根结点。
 * Created by hzq on 17-1-20.
 */
public class HeapSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] ints = array.initialization(n);
            System.out.printf("原始序列为：");
            print_arr(ints);
            HeapSort(ints);
        }
    }

    /**
     * 堆排序算法
     *
     * @param arr
     */
    private static void HeapSort(int[] arr) {
        //初始堆
        BuildHeap(arr);
        //从最后一个元素开始对序列进行调整
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);//交换堆顶元素H[0]和堆中最后一个元素
            HeapAdjust(arr, 0, i);//每次交换堆顶元素和堆中最后一个元素之后，都要对堆进行调整
        }
    }

    private static void BuildHeap(int[] arr) {
        //最后一个有孩子的节点的位置 i= (length -1) / 2
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            HeapAdjust(arr, i, arr.length);
        }
    }

    /**
     * 已知arr[parent…m]除了arr[parent] 外均满足堆的定义
     * 调整arr[parent],使其成为大顶堆.即将对第parent个结点为根的子树筛选,
     *
     * @param arr    待调整的堆数组
     * @param parent 是待调整的数组元素的位置
     * @param length 数组的长度
     */
    private static void HeapAdjust(int[] arr, int parent, int length) {
        int temp = arr[parent];
        int child = 2 * parent + 1;//左孩子结点的位置。(i+1 为当前调整结点的右孩子结点的位置)
        while (child < length) {
            if (child + 1 < length && arr[child] < arr[child + 1]) {// 如果右孩子存在，且大于左孩子(找到比当前待调整结点大的孩子结点)
                ++child;
            }//child指向较大的孩子结点

            if (arr[parent] < arr[child]) {// 如果较大的子结点大于父结点
                arr[parent] = arr[child];// 那么把较大的子结点往上移动，替换它的父结点
                //如果当前child下面还有子结点，进入while
                parent = child;// 重新设置parent ,即待调整的下一个结点的位置
                child = 2 * parent + 1;
            } else {// 如果当前待调整结点大于它的左右孩子，则不需要调整，直接退出(以当前parent为根结点的子树，已建成堆)
                break;
            }
            arr[parent] = temp;//当前待调整的结点放到比其大的孩子结点位置上
        }
        print_arr(arr);
    }
}
