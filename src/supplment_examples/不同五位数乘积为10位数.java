package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-12.
 */
public class 不同五位数乘积为10位数 {
    private final static int LEN = 10;
    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n < 1) {
                //异常代码
            }
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = i;//数组0-9
            }
            permu(ints,0,ints.length);
        }
    }

    protected static void permu(int[] arr, int begin, int end) {
        if (begin == end) {
            if (arr[0] != 0) {
                solution(arr);
            }
        } else {
            for (int i = begin; i < end; i++) {
                int temp = arr[i];
                arr[i] = arr[begin];
                arr[begin] = temp;
                permu(arr, begin + 1, end);
                temp = arr[begin];
                arr[begin] = arr[i];
                arr[i] = temp;
            }
        }
    }

    private static void solution(int[] arr) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arr.length / 2; i++) {
            sb1.append(arr[i]);
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            sb2.append(arr[i]);
        }

        int left = Integer.parseInt(sb1.toString());
        int right = Integer.parseInt(sb2.toString());
        int multi = left * right;
        if ((multi + " ").length() == LEN && count < 11) {
            count++;
            System.out.println(left + " * " + right + " = " + multi);
        }
    }
}
