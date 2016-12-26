package supplment_examples;

import java.util.Scanner;

/**
 * 判断一个自然数是否是质数。
 * Created by hzq on 16-12-25.
 */
public class 质数判断 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int in = scanner.nextInt();
            if (new Judge().prime2(in)) {
                System.out.println(in + "是质数");
            } else {
                System.out.println(in + "不是质数");
            }
        }
    }
}

class Judge{
    //遍历2～n-1的所有元素
    public static boolean prime1(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    //遍历2～Math.sqrt(num)
    public static boolean prime2(int num) {
        boolean flag = true;
        int temp = (int) Math.sqrt(num);
        for (int i = 2; i <= temp; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}