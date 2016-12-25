package supplment_examples;

import java.util.Scanner;

/**
 * 如果苹果 1元/个， 桔子 2 元/个， 芒果 4元/个，若是用10元去买，有几种组合呢？ 通用模板：4个参数
 * Created by hzq on 16-12-25.
 */
public class 组合问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            float c = scanner.nextFloat();
            int sum = scanner.nextInt();
            System.out.println("总共有" + combination(a, b, c, sum) + "种方案");
        }
    }

    public static int combination(int a, int b, float c, int sum) {
        int temp1 = sum / a;
        int temp2 = sum / b;
        int temp3 = (int) (sum / c);
        int count = 0;
        for (int i = 0; i <= temp1; i++) {
            for (int j = 0; j <= temp2; j++) {
                for (int k = 0; k <= temp3; k++) {
                    if (a * i + b * j + c * k == sum) {
                        count++;
                        System.out.println("苹果：" + i + "个 " + "桔子：" + j + "个 " + "桔子：" + k + "个");
                    }
                }
            }
        }
        return count;
    }
}
