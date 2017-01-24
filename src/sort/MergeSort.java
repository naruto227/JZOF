package sort;

import array_list.Array;

import java.util.Scanner;

import static array_list.输出数列.print_arr;

/**
 * Created by Michael Allan on 2017/1/22.
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] ints = array.initialization(n);
            System.out.printf("原始序列为：");
            print_arr(ints);
        }
    }

    //归并
    private static void MergeSort(int[] arrA, int[] arrB, int length) {
        int len = 1;
        int[] ints = new int[length];
        ints = arrA;

    }
}
