package 进制转换;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-27.
 */
public class 十进制转其它进制 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();//输入一个十进制数
            int n = scanner.nextInt();//十进制转为其它n进制
            new TenToN().tenToN(num, n);
        }
    }
}

class TenToN {
//    该方法能从十进制转化到10以下的进制
    public void tenToN(int num, int n) {
        if(n == 1){
            System.out.println(num);
            return;
        }
        int[] ints = new int[32];
        int count = 0;
        while (num != 0) {
            ints[count++] = num % n;
            num /= n;
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(ints[i]);
        }
        System.out.println();
    }

    public void tenToN1(int num, int n) {
        System.out.println(Integer.toString(num, n));//系统方法,任意十进制数转化为n进制数

    }

}