package sort;

import array_list.Array;

import static supplment_examples.数组编码.print_arr;

/**
 * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，
 * 依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
 * Created by hzq on 17-1-14.
 */
public class SimpleSelectSort {
    public static void main(String[] args) {
        Array array = new Array();
        int[] ints = array.initialization(10);
        System.out.printf("the original array: ");
        print_arr(ints);
//        selectSort(ints);
        selectSortChange(ints);
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    private static void selectSort(int[] arr) {
        int key;
        for (int i = 0; i < arr.length; i++) {
            key = selectMinKey(arr, i);//选择最小的元素
            if (key != i) {//最小元素与第i位置元素互换
                swap(arr, i, key);
            }
            print_arr(arr);
        }
    }

    /**
     * 数组的最小值
     *
     * @param arr
     * @param j
     * @return 数组的键值
     */
    private static int selectMinKey(int[] arr, int j) {
        int key = j;
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] < arr[key]) {//
                key = i;
            }
        }
        return key;
    }

    /**
     * 改进后的算法实现为:我们考虑利用在每趟排序中进行正向和反向两遍冒泡的方法一次可以得到两个最终值(最大者和最小者) , 从而使排序趟数几乎减少了一半。
     *
     * @param arr
     */
    private static void selectSortChange(int[] arr) {
        int i, j;
        int min, max;
        // 做不超过arr.length / 2趟选择排序
        for (i = 0; i < arr.length / 2; i++) {
            min = i;
            max = i;//分别记录最大和最小关键字记录位置
            for (j = i + 1; j < arr.length - i; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    continue;
                }
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            //分情况讨论以提高效率
            if (i == max) {//
                swap(arr, arr.length - i - 1, max);
                swap(arr, i, min);
            } else {
                swap(arr, i, min);
                swap(arr, arr.length - i - 1, max);
            }
            print_arr(arr);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
