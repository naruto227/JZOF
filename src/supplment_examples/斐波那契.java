package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-26.
 */
/*f(n) = f(n-1) + f(n-2)*/
public class 斐波那契 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci1(i) + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci2(i) + " ");
            }
        }
    }

    //递归
    public static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //指针
    public static int fibonacci1(int n) {
        if (n < 3) {
            return 1;
        }
        int f1 = 1, f2 = 1;
        n--;
        while (n-- != 0) {
            f1 = f1 + f2;
            f2 = f1 - f2;
        }
        return f1;
    }

    public static int fibonacci2(int n) {
        if (n < 3) {
            return 1;
        }
        int f1 = 1, f2 = 1, res = 0;
        n--;
        while (n-- != 0) {
            res = f1 + f2;
            f2 = f1;
            f1 = res;
        }
        return res;
    }
}
