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
            iterationArr(n);
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
                ints[j][i] = ints[j+1][i-1] + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
