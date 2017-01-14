package sort;

import array_list.Array;

import static supplment_examples.数组编码.print_arr;

/**
 * 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 按增量序列个数k，对序列进行k 趟排序；
 * 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 * 我们简单处理增量序列：增量序列d = {n/2 ,n/4, n/8 .....1} n为要排序数的个数
 * 即：先将要排序的一组记录按某个增量d（n/2,n为要排序数的个数）分成若干组子序列，每组中记录的下标相差d.对每组中全部元素进行直接插入排序，然后再用一个较小的增量（d/2）对它进行分组，
 * 在每组中再进行直接插入排序。继续不断缩小增量直至为1，最后使用直接插入排序完成排序。
 * Created by hzq on 17-1-14.
 */
public class ShellSort {
    public static void main(String[] args) {
        Array array = new Array();
        int[] ints = array.initialization(5);
        System.out.printf("the original array: ");
        print_arr(ints);
        shellSort(ints);
    }

    /**
     * 先按增量d（n/2,n为要排序数的个数进行希尔排序
     *
     * @param arr
     */
    private static void shellSort(int[] arr) {
        int dk = arr.length / 2;
        while (dk >= 1) {
            shellInsertSort(arr, dk);
            dk /= 2;
        }
    }

    /**
     * 直接插入排序的一般形式
     *
     * @param arr
     * @param dk
     */
    private static void shellInsertSort(int[] arr, int dk) {
        for (int i = dk; i < arr.length; i++) {
            if (arr[i] < arr[i - dk]) {
                int j = i - dk;
                int temp = arr[i];
                arr[i] = arr[j];
                while (j >= 0 && temp < arr[j]) {
                    arr[j + dk] = arr[j];
                    j -= dk;
                }
                arr[j + dk] = temp;
            }
            print_arr(arr);
        }
    }
}
