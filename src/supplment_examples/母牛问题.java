package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-26.
 */
/*
一个农场有头母牛，现在母牛才一岁，要到四岁才能生小牛，四岁之后，每年生一头小牛。
假设每次生的都是母牛，并且也遵守4年才生育并生母牛的原则。且所生的牛都不会死
问20年之后共有多少头牛
ok
*/
public class 母牛问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            System.out.println("第" + year + "年，" + "有" + getCowNum(year) + "只牛");
        }
    }

    public static int getCowNum(int year) {
        int total = 1;//当前有一头牛
        int temp = 0;
        if (year > 0) {
            while (year != 0) {
                if (temp >= 2) {//当前为一岁，两年后为四岁
                    total += getCowNum(year - 2);//递归,两年后母牛生一头小牛,而小牛又像当初的母牛一样两年后生小牛,不断循环
                }
                temp++;
                year--;
            }
        }
        return total;
    }
}
