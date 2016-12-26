package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-26.
 */
public class 个位和百位对调 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int a = new Judge().numOfDigits(num);
            if (a == 0) {
                System.out.println("请输入一个自然数");
            } else if (a != 3) {
                System.out.println(num + "是一个" + a + "位数字");
            } else {
                System.out.println("三位数字" + num + "置换后：" + swapNum(num));
            }
        }
    }

    public static int swapNum(int num) {
        int a = num % 10;
        int b = num / 10 % 10;
        int c = num / 100;
        return a * 100 + b * 10 + c;
    }

    static class Judge {
        public int numOfDigits(int n) {
            if (n <= 0) {
                return 0;
            }
            int num = 0;
            while (n != 0) {
                num++;
                n /= 10;
            }
            return num;
        }
    }
}

