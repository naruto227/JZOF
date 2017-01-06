package array_list;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-6.
 */
public class 蛇形矩阵 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
//            iterationArr(n);
            print(n);
        }
    }

    /*
    1	3	6	10	15
    2	5	9	14
    4	8	13
    7	12
    11
    */
    private static void iterationArr(int n) {
        int[][] ints = new int[n][n];
        ints[0][0] = 1;
        for (int i = 0; i < n - 1; i++) {
            ints[i + 1][0] = ints[i][0] + i + 1;
        }

        for (int i = 1; i < n; i++) {//表列
            for (int j = 0; j < n - 1; j++) {//表行
                ints[j][i] = ints[j + 1][i - 1] + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*
    1	2	6	7
    3	5	8	13
    4	9	12	14
    10	11	15	16
    */
    public static void print(int n) {
        int[][] data = new int[n][n];
        data[0][0] = 1;
        data[n - 1][n - 1] = n * n;

        //将蛇形矩阵按照正对角线分为上半部分和下半部分
        //现在先来设计上半部分，并且负责对角线，上半部分可将斜线的顺序记为k,按k的奇偶性进行判断
        for (int k = 1; k <= (n - 1); k++) {
            if (k % 2 == 1) {//当k为奇数时，代表每条斜线的最小值在上方
                data[0][k] = 1 + k * (k + 1) / 2;
                for (int i = 1; i <= k; i++) {
                    data[i][k - i] = data[0][k] + i;//行递增，列递减

                }
            } else {//当k为偶数时，代表每条斜线的最小值在下方
                data[k][0] = 1 + k * (k + 1) / 2;
                for (int i = 0; i <= k; i++) {
                    data[k - i][i] = data[k][0] + i;              //行递减，列递增

                }
            }
        }//上半部分就已经设计好了，接着设计下半部分

        //下半部分就会显得比较复杂，首先要先判断n的奇偶性，还要再判断k的奇偶性
        //从左向右按照从大到小的顺序进行斜线的连接，同样以k代表斜线的序号
        if (n % 2 == 0) {//如果n为偶数
            for (int k = 1; k <= (n - 2); k++) {
                if (k % 2 == 1) {//当k为奇数的时候每条斜线的最大值在上方
                    data[k][n - 1] = data[n - 1][n - 1] - (n - k - 1) * (n - k) / 2;
                    for (int i = 1; i < n - k; i++) {
                        data[k + i][n - 1 - i] = data[k][n - 1] - i;//行递增，列递减
                    }
                } else {//当k为偶数的时候，每条斜线的最大值在下方
                    data[n - 1][k] = data[n - 1][n - 1] - (n - k - 1) * (n - k) / 2;
                    for (int i = 1; i < n - k; i++) {
                        data[n - 1 - i][k + i] = data[n - 1][k] - i;//行递减，列递增
                    }
                }
            }
        } else {//如果n为奇数，那么就是相反的
            for (int k = 1; k <= (n - 2); k++) {
                if (k % 2 == 0) {//当k为偶数的时候每条斜线的最大值在上方
                    data[k][n - 1] = data[n - 1][n - 1] - (n - k - 1) * (n - k) / 2;
                    for (int i = 1; i < n - k; i++) {
                        data[k + i][n - 1 - i] = data[k][n - 1] - i;//行递增，列递减
                    }
                } else {//当k为奇数的时候，每条斜线的最大值在下方
                    data[n - 1][k] = data[n - 1][n - 1] - (n - k - 1) * (n - k) / 2;
                    for (int i = 1; i < n - k; i++) {
                        data[n - 1 - i][k + i] = data[n - 1][k] - i;//行递减，列递增
                    }
                }
            }
        }//下半部分的就设计好咯

        //接下来就是显示矩阵咯

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }//结束显示，结束print方法，进入main方法
    }//结束构造方法
}
