package array_list;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-27.
 */
/*输出1 1 2 3 5 8 13……这样的数列，输出该数列的前20个数字。*/
public class 输出数列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            initialization(n);
        }
    }

    public static void initialization(int n) {
        int[] ints = new int[n];
        ints[0] = 1;
        ints[1] = 1;
        for (int i = 2; i < ints.length; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        print_arr(ints);
    }

    public static void print_arr(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "\t");
        }
        System.out.println();
    }
}
