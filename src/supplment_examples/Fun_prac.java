package supplment_examples;

import array_list.Array;

import java.util.Scanner;

import static array_list.输出数列.print_arr;

/**
 * Created by hzq on 17-1-10.
 */
public class Fun_prac {
    public static void main(String[] args) {
//        Math.abs(-10);
        Array array = new Array();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println("绝对值为：" + abs(n));
            int[] ints = array.initialization(n);
            print_arr(ints);
            System.out.println("数列和为：" + sumArr(ints));
        }
    }

    //byte -128
    private static int abs(int n) {
        return n > 0 ? n : (-n);
    }

    private static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
