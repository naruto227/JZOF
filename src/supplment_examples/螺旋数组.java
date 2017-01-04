package supplment_examples;

import java.util.Scanner;

import static supplment_examples.拉丁方阵.printMultiArr;

/**
 * Created by hzq on 17-1-4.
 */
/* 要求：存储和输出nXm的螺旋数组，其中n和m为大于0的整数。
* 4*4
1	2	3	4
12	13	14	5
11	16	15	6
10	9	8	7 */
public class 螺旋数组 {
//
    private static final int LEFT = 1;
    private static final int RIGHT = 2;
    private static final int UP = 3;
    private static final int DOWN = 4;
    private static int direction;   //当前数字的移动方向

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            direction = RIGHT;
            createArr(n, m);
        }
    }

    public static void createArr(int n, int m) {
        int[][] ints = new int[n][m];
        int temp = n * m;
        int value = 1;//
        int row = 0, col = 0;
        ints[row][col] = value;
        while (value < temp) {
            switch (direction) {
                case RIGHT:
                    col++;
                    if (col >= m) {
                        col--;
                        row++;
                        direction = DOWN;
//                        continue;
                    } else if (ints[row][col] != 0) {
                        col--;
                        row++;
                        direction = DOWN;
                    } else {
                        direction = RIGHT;
                    }
                    break;
                case DOWN:
                    row++;
                    if (row >= n) {
                        row--;
                        col--;
                        direction = LEFT;
                    } else if (ints[row][col] != 0) {
                        row--;
                        col--;
                        direction = LEFT;
                    } else {
                        direction = DOWN;
                    }
                    break;
                case LEFT:
                    col--;
                    if (col < 0) {
                        col++;
                        row--;
                        direction = UP;
                    } else if (ints[row][col] != 0) {
                        col++;
                        row--;
                        direction = UP;
                    } else {
                        direction = LEFT;
                    }
                    break;
                case UP:
                    row--;
                    if (row < 0) {
                        row++;
                        col++;
                        direction = RIGHT;
                    } else if (ints[row][col] != 0) {
                        row++;
                        col++;
                        direction = RIGHT;
                    } else {
                        direction = UP;
                    }
                    break;
                default:
                    break;
            }
            value++;
            ints[row][col] = value;
        }
        printMultiArr(ints);
    }
}
