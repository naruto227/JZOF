package 进制转换;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-27.
 */
public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入输入的进制：");
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println("请输入输入的" + n + "进制的一个数：");
            String input = scanner.next();
            System.out.println("请输入输出的进制：");
            int m = scanner.nextInt();
            NtoM(n, input, m);
            System.out.println("请输入输入的进制：");
        }
    }

    //任意n进制数转化成m进制
    public static void NtoM(int n, String input, int m) {
        int i = Integer.parseInt(input, n);//输入的string类型的数，转换成n进制数
        System.out.println(Integer.toString(i, m));//n进制的数转化成m进制的数
    }
}
