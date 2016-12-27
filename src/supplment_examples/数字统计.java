package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-27.
 */
/*要求：统计一个整数中出现最多的数字。如果数字个数一样，则以最大的数字为准，例如1输出1，121输出1，23231输出3。*/
public class 数字统计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(mostNum(num));
        }
    }

    public static int mostNum(int num) {
        int[] ints = new int[32];//存放拆分后的数字
        int n = 0;//num数字的个数
        while (num != 0) {
            ints[n] = num % 10;//获取个位数
            n++;//num数字的个数加1
            num /= 10;//去掉个位数，原十位数变为个位数
        }

        int[] count = new int[10];
        //统计0-9出现的次数
        for (int i = 0; i < n; i++) {
            count[ints[i]]++;
        }

        int index = 0, len1 = count.length;
//        获得最大值的下标
        for (int i = 0; i < len1; i++) {
            if (count[index] <= count[i]) {
                index = i;
            }
        }
        return index;
    }
}
