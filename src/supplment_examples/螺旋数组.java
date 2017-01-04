package supplment_examples;

import java.util.Scanner;

import static supplment_examples.拉丁方阵.printMultiArr;

/**
 * Created by hzq on 17-1-4.
 */
/* 要求：存储和输出nXm的螺旋数组，其中n和m为大于0的整数。
* */
public class 螺旋数组 {

    private static final int LEFT = 1;
    private static final int RIGHT = 2;
    private static final int UP = 3;
    private static final int DOWN = 4;
    private static int direction = RIGHT;   //当前数字的移动方向

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            createArr(n, m);
        }
    }

    private static void createArr(int n, int m) {
        int[][] ints = new int[n][m];
        int temp = n * m + 1;
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
                        row++;
                        direction = LEFT;
                    } else {
                        direction = DOWN;
                    }
                    break;
                case LEFT:
                    row--;
                    if (row < 0) {
                        row++;
                        direction = UP;
                    } else if (ints[row][col] != 0) {
                        row++;
                        direction = UP;
                    } else {
                        direction = LEFT;
                    }
                    break;
                case UP:
                    col--;
                    if (col < 0) {
                        col++;
                        direction = RIGHT;
                    } else if (ints[row][col] != 0) {
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
