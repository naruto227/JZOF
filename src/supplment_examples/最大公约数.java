package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-23.
 */
public class 最大公约数 {

    //遍历求解
    public static int solution(int a, int b) {
        int max, min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        int i;
        for (i = min; i > 1; i--) {
            if (max % i == 0 && min % i == 0) {
                break;
            }
        }
        return i;
    }

    public static int gcd(int a, int b) {
        int c;
        /*if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }*/
        /**
         * 利用辗除法，直到b为0为止
         * 如果a<b，第一次循环时，a,b互换了。如a = 10, b = 20 ——> a = 20, b = 10
         * */
        while (b != 0) {
            c = b;
            b = a % b;
            a = c;
        }
        return a;
    }
}
