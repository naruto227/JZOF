package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-23.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(14 % 1);
        最大公约数 max_yue = new 最大公约数();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("a = " + a + ", b = " + b);
//            System.out.println("最大公约数：" + solution(a, b));
            System.out.println("最大公约数：" + max_yue.gcd(a, b));

        }
    }
}
