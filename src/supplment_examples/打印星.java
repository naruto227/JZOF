package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-24.
 */
public class 打印星 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            printStar(num);
        }
    }

    public static void printStar(int num) {
        int top = num + 1;
//      打印前num行的星
        for (int i = 1; i < top; i++) {
            for (int j = 1; j < top - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
//      打印num+1到2*num-1行的星
        for (int i = num + 1; i < 2 * num + 1; i++) {
//          打印空格数
            for (int j = 1; j <= (i - num); j++) {
                System.out.printf(" ");
            }
//          打印星的数量
            for (int j = 0; j < (2 * num - 1 - 2 * (i - num)); j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
