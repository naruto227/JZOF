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

    private static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                int j = i - 1;
                int temp = arr[i];//
                arr[i] = arr[j];
                while (temp < arr[j] && j >= 0){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = temp;
            }
            print_arr(arr);
        }
    }
}
