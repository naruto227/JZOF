package supplment_examples;

import java.util.Date;

/**
 * 问题描述：每只母鸡3元，每只公鸡4元，每只小鸡0.5元，如果花100元钱买100只鸡，请问有哪些可能？说明：每种鸡的数量都可以为零。
 * Created by hzq on 16-12-23.
 */
public class 百元百鸡 {
    public static void main(String[] args) {
        Date date = new Date();
        bianli(date.getTime());
    }

    public static void bianli(long time) {
        int count = 0;
        for (int i = 0; i <= 100; i++) { //母鸡数量
            for (int j = 100 - i; j >= 0; j--) { //公鸡数量
                for (int k = 100 - i - j; k >= 0; k--) { //小鸡数量
                    //判断数量是否为100，以及金额是否为100
                    if ((i * 3 + j * 4 + k * 0.5 == 100)) {
                        count++;
                        System.out.println("母鸡数量：" + i + " 公鸡数量：" + j + " 小鸡数量:" + k);
                    }
                }
            }
        }
        System.out.println("总共有" + count + "种方案");
        Date date1 = new Date();
        long time1 = date1.getTime();
        System.out.println("程序运行时间：" + (time1 - time) + "ms");
    }
}
