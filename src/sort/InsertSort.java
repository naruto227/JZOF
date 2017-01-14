package sort;

import array_list.Array;

import static supplment_examples.数组编码.print_arr;
//import array_list.输出数列;

/**
 * Created by hzq on 17-1-14.
 */
public class InsertSort {
    public static void main(String[] args) {
//        输出数列 printSort = new 输出数列();
        Array array = new Array();
        int[] ints = array.initialization(10);
        System.out.printf("the original array: ");
        print_arr(ints);
        insertSort(ints);
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {//若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
                int j = i - 1;
                int temp = arr[i];//复制为哨兵，即存储待排序元素
                arr[i] = arr[j];
                while (temp < arr[j] && j >= 0) {
                    arr[j + 1] = arr[j];
                    j--;//元素后移
                }
                arr[j + 1] = temp;//插入到正确位置
            }
            print_arr(arr);//打印每趟排序的结果
        }
    }
}
