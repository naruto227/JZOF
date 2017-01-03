package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-2.
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        拉丁方阵 ld = new 拉丁方阵();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            ld.printMultiArr(createYHTriangle(n));
        }
    }

    public static int[][] createYHTriangle(int n) {
        int[][] ints = new int[n][n];
        for (int i = 0; i < n; i++) {
            ints[i][0] = 1;
            ints[i][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                ints[i][j] = ints[i - 1][j] + ints[i - 1][j - 1];
            }
        }
        return ints;
    }
}
