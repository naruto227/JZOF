package supplment_examples;

import java.util.Scanner;

/**
 * 水仙花数指三位数中，每个数字的立方和和自身相等的数字，例如370，3 × 3 × 3 + 7 × 7 × 7 + 0 × 0 × 0 =370，
 * 请输出所有的水仙花数。
 * Created by hzq on 16-12-23.
 */
public class 水仙花数 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if (isDaffodils(i)) {
                count++;
                System.out.printf(i + "\t");
            }
            if (count == 5){
                System.out.println();
            }
        }
    }

    //判断是否为水仙花数
    public static boolean isDaffodils(int num) {
        int a = num % 10; //个位数
        int b = (num / 10) % 10;    //十位数
        int c = num / 100;    //百位数
        if (num == cubicSum(a) + cubicSum(b) + cubicSum(c)) {
            return true;
        } else {
            return false;
        }
    }

    //    求数字立方和
    public static int cubicSum(int x) {
        return x * x * x;
    }
}
