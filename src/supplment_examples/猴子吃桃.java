package supplment_examples;

import java.util.Scanner;

/**
 * 一只猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个,第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个，第10天早上想再吃时，发现只剩下一个桃子了。请问猴子第一天一共摘了多少个桃子？
 * Created by hzq on 16-12-25.
 */
//4个参数，吃几分之几，多吃几个，最后一天，剩几个
public class 猴子吃桃 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();//吃几分之几
            int b = scanner.nextInt();//多吃几个
            int c = scanner.nextInt();//最后一天是第几天
            int d = scanner.nextInt();//最后剩几个
            System.out.println("一共摘了" + sum(a, b, c, d) + "个桃子");
        }
    }

    public static int sum(int a, int b, int c, int d) {
        int temp = d;
        int i = c - 1;
        for (; i > 0; i--) {
            temp = (temp + b) * a;
            System.out.println("第" + i + "天有" + temp + "个桃子");
        }
        return temp;
    }

}
