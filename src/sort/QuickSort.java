package sort;

import array_list.Array;

import static sort.BubbleSort.swap;
import static supplment_examples.数组编码.print_arr;

/**
 * Created by hzq on 17-1-14.
 */
public class QuickSort {
    public static void main(String[] args) {
        Array array = new Array();
        int[] ints = array.initialization(10);
        System.out.printf("the original array: ");
        print_arr(ints);
    }

    private static int partition(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (low< high && arr[low]<= arr[high]){
                --high;
            }
            swap(arr,low,high);
            while (low<high && arr[low]>=arr[high]){
                ++low;
            }

        }
    }
}
