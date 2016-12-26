package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-26.
 */
public class 计算阶乘 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println(a + "的阶乘：" + factorial(a));
            System.out.println(factorial1(a));
        }
    }

    //循环实现
    public static int factorial(int num) {
        int temp = num;
        int sum = 1;
        while (temp != 0) {
            sum *= temp;
            temp--;
        }
        return sum;
    }

    //递归实现
    public static int factorial1(int num) {
        if (num < 3) {
            return num;
        } else {
            return num * factorial1(num - 1);
        }
    }
}
