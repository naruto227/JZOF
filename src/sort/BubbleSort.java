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
            System.out.printf("原始序列为：");
            print_arr(ints);
            sort3(ints, n);
        }
    }

    //固定首位为最小
    public static void sort1(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
            System.out.printf("第" + (i + 1) + "步排序后的序列为：");
            print_arr(arr);
        }
    }

    //序列两两比较
    public static void sort2(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.printf("第" + (i + 1) + "步排序后的序列为：");
            print_arr(arr);
        }
    }

    /*设置一标志性变量pos,用于记录每趟排序中最后一次进行交换的位置。由于pos位置之后的记录均已交换到位,故在进行下一趟排序时只要扫描到pos位置即可*/
    public static void sort3(int[] arr, int n) {
        int cnt = 0;//计步器
        for (int i = n - 1; i > 0; ) {
            int pos = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    pos = j;
                    swap(arr, j, j + 1);
                }
            }
            i = pos;//从后向前推,当pos最后为0时,即退出循环
            System.out.printf("第" + (++cnt) + "步排序后的序列为：");
            print_arr(arr);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
