package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-26.
 */
/*日本一位中学生发现一个奇妙的“定理”，请角谷教授证明，而教授无能为力，于是产生角谷猜想。猜想的内容是：任给一个自然数，若为偶数除以2，
若为奇数则乘3加1，得到一个新的自然数后按照上面的法则继续演算，若干次后得到的结果必然为1。试编写代码验证该猜想是否正确。*/
public class 角谷猜想问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (verifyGuess(num)) {
                System.out.println("该定理为正确的");
            } else {
                System.out.println("该定理为错误的");
            }
        }
    }

    public static boolean verifyGuess(int num) {
        int temp = num;
        int count = 0;
        while (temp != 1) {
            count++;
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = temp * 3 + 1;
            }
            if (count > 1000) {
                return false;
            }
        }
        System.out.println("循环执行" + count + "次");
        return true;
    }
}
