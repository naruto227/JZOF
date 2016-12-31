package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-31.
 */
public class 汉诺塔 {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();//n个盘子
            hanNuoTa(n, 'A', 'B', 'C');
            System.out.println("总共" + (int)(Math.pow(2, n) - 1) + "次");
        }
    }

    public static void hanNuoTa(int n, char x, char y, char z) {
        if (n == 1) {
            move(x, z);
        } else {
            hanNuoTa(n - 1, x, z, y);
            move(x, z);
            hanNuoTa(n - 1, y, x, z);
        }
    }

    public static void move(char x, char y) {
//        count++;
        System.out.println("第" + (++count) + "次移动：" + x + "->" + y);
    }
}
