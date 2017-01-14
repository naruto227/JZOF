package sort;

import array_list.Array;

import static supplment_examples.数组编码.print_arr;

/**
 * Created by hzq on 17-1-14.
 */
public class ShellSort {
    public static void main(String[] args) {
//        输出数列 printSort = new 输出数列();
        Array array = new Array();
        int[] ints = array.initialization(5);
        System.out.printf("the original array: ");
        print_arr(ints);
        shellSort(ints);
    }

    private static void shellSort(int[] arr) {
        int dk = arr.length / 2;
        while (dk >= 1) {
            shellInsertSort(arr, dk);
            dk /= 2;
        }
    }

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
