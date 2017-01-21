package sort;

import array_list.Array;

import java.util.Scanner;

import static array_list.输出数列.print_arr;
import static sort.BubbleSort.swap;

/**
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
