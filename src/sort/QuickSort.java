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
        quickSort(ints, 0, ints.length - 1);
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
}
