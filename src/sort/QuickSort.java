package sort;

import array_list.Array;

import static sort.BubbleSort.swap;
import static supplment_examples.数组编码.print_arr;

/**
 * 1）选择一个基准元素,通常选择第一个元素或者最后一个元素,
 * 2）通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小。另一部分记录的 元素值比基准值大。
 * 3）此时基准元素在其排好序后的正确位置
 * 4）然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序。
 * Created by hzq on 17-1-14.
 */
public class QuickSort {
    public static void main(String[] args) {
        Array array = new Array();
        int[] ints = array.initialization(10);
        System.out.printf("the original array: ");
        print_arr(ints);
//        quickSort(ints, 0, ints.length - 1);
        sortChange(ints, 0, ints.length - 1, 8);
    }

    private static int partition(int[] arr, int low, int high) {
        int temp = arr[low];//基准元素
        while (low < high) {//从表的两端交替地向中间扫描
            while (low < high && temp <= arr[high]) {//从high 所指位置向前搜索，至多到low+1 位置。将比基准元素小的交换到低端
                --high;
            }
            swap(arr, low, high);
            while (low < high && arr[low] <= temp) {
                ++low;
            }
            swap(arr, low, high);
        }
        print_arr(arr);
        return low;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);//将表一分为二
            quickSort(arr, low, index - 1);//递归对低子表递归排序
            quickSort(arr, index + 1, high);//递归对高子表递归排序
        }
    }

    /**
     * 在本改进算法中,只对长度大于k的子序列递归调用快速排序,让原序列基本有序，然后再对整个基本有序序列用插入排序算法排序。
     * 实践证明，改进后的算法时间复杂度有所降低，且当k取值为 8 左右时,改进算法的性能最佳。
     * @param arr
     * @param low
     * @param high
     * @param k
     */
    private static void quickSortImprove(int[] arr, int low, int high, int k) {
        if (high - low > k) {
            int index = partition(arr, low, high);//将表一分为二
            quickSortImprove(arr, low, index - 1, k);//递归对低子表递归排序
            quickSortImprove(arr, index + 1, high, k);//递归对高子表递归排序
        }
    }

    private static void sortChange(int[] arr, int low, int high, int k) {
        quickSortImprove(arr, low, high, k);//先调用改进算法Qsort使之基本有序
        System.out.println("开始插入排序");
        //再用插入排序对基本有序序列排序
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j = i - 1;
                arr[i] = arr[j];
                while (j >= 0 && arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
            print_arr(arr);
        }
    }
}
/*快速排序是通常被认为在同数量级（O(nlog2n)）的排序方法中平均性能最好的。但若初始序列按关键码有序或基本有序时，快排序反而蜕化为冒泡排序。
为改进之，通常以“三者取中法”来选取基准记录，即将排序区间的两个端点与中点三个记录关键码居中的调整为支点记录。快速排序是一个不稳定的排序方法。*/