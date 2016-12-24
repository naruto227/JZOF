package supplment_examples;

import java.util.Scanner;

/**
 * 在控制台打印数学上的99乘法表
 * Created by hzq on 16-12-23.
 */
public class 九九乘法表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            solution(num);
            solution1(num);
        }
    }

    //正三角
    public static void solution(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.printf(j + "*" + i + "=" + i * j + "\t");
                if (i == j) {
                    System.out.println();
                    break;
                }
            }
        }
    }

    public static void solution1(int num) {
        for (int row = 1; row <= num; row++) {       //循环行
            for (int col = 1; col <= row; col++) {   //循环列
                System.out.print(row * col);  //输出数值
                if (row * col < 10) {     //一位数
                    System.out.print(' ');
                }
                System.out.print(' ');        //输出数字之间的间隔空格
            }
            System.out.println();           //一行输出结束，换行
        }
    }
}
