package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-23.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(14 % 1);
        最大公约数 max_yue = new 最大公约数();
        最小公倍数 min_bei = new 最小公倍数();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("a = " + a + ", b = " + b);
//            System.out.println("最大公约数：" + solution(a, b));
            System.out.println("最大公约数：" + max_yue.gcd(a, b));
            System.out.println("遍历求最小公倍数：" + min_bei.bianli(a, b));
            System.out.println("利用a*b/(a与b的最大公约数)：" + a * b / max_yue.solution(a, b));
        }
    }
}
