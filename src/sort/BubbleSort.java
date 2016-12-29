package sort;

import array_list.Array;

import java.util.Scanner;
//引入类的方法
import static array_list.输出数列.print_arr;

/**
 * Created by Michael Allan on 2016/12/30.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] ints = array.initialization(n);
            sort2(ints, n);
        }
    }

    //固定首位为最小
    public static void sort1(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
            System.out.printf("第" + i + "步排序后的序列为：");
            print_arr(arr);
        }
    }

    //序列两两比较
    public static void sort2(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.printf("第" + (i + 1) + "步排序后的序列为：");
            print_arr(arr);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
