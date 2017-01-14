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
        selectSort(ints);
    }

    private static void selectSort(int[] arr){
        int key, temp;
        for (int i = 0; i < arr.length; i++) {
            key = selectMinKey(arr, i);
            if(key != i){
                temp = arr[i];
                arr[i] = arr[key];
                arr[key] = temp;
            }
            print_arr(arr);
        }
    }

    private static int selectMinKey(int[] arr, int j){
        int key = j;
        for (int i = j + 1; i < arr.length; i++) {
            if(arr[i] < arr[key]){//
                key = i;
            }
        }
        return key;
    }
}
