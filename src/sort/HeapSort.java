package sort;

import array_list.Array;

import java.util.Scanner;

import static array_list.输出数列.print_arr;
import static sort.BubbleSort.swap;

/**
 * Created by hzq on 17-1-20.
 */
public class HeapSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] ints = array.initialization(n);
            System.out.printf("原始序列为：");
            print_arr(ints);
            HeapSort(ints);
        }
    }

    private static void HeapSort(int[] arr) {
        //初始堆
        BuildHeap(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            HeapAdjust(arr, 0, i);
        }
    }

    private static void BuildHeap(int[] arr) {
        //最后一个有孩子的节点的位置 i= (length -1) / 2
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            HeapAdjust(arr, i, arr.length);
        }
    }

    private static void HeapAdjust(int[] arr, int parent, int length) {
        int temp = arr[parent];
        int child = 2 * parent + 1;
        while (child < length) {
            if (child + 1 < length && arr[child] < arr[child + 1]) {
                ++child;
            }

            if (arr[parent] < arr[child]) {
                arr[parent] = arr[child];
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
            arr[parent] = temp;
        }
        print_arr(arr);
    }
}
