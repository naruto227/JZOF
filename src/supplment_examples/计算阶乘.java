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
        }
    }

    public static int factorial(int num) {
        int temp = num;
        int sum = 1;
        while (temp != 0) {
            sum *= temp;
            temp--;
        }
        return sum;
    }
}
