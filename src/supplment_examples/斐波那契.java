package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-26.
 */
/*f(n) = f(n-1) + f(n-2)
* 1 1 2 3 5 8 13 21 34
* 下标从0开始计*/
public class 斐波那契 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            new digitalLaw().solution(n);
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
            System.out.println();
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
        if (n < 2) {
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
        if (n < 2) {
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

/*输出30个如下规律的数列： 1 3 6 10 15 21……    n*(n+1)/2*/
class digitalLaw {
    public void solution(int num) {
        if (num < 1) {
            return;
        } else {
            for (int i = 1; i <= num; i++) {
                System.out.print(i * (i + 1) / 2 + " ");
            }
        }
        System.out.println();
    }
}
