package supplment_examples;

import java.util.Scanner;

import static supplment_examples.拉丁方阵.printMultiArr;

/**
 * Created by hzq on 17-1-4.
 */
/* 要求：存储和输出nXm的螺旋数组，其中n和m为大于0的整数。实现思路：声明一个变量来代表需要为数组元素赋的值，对于其中的数字来说，每个数字都有一个移动方向，
这个方向指向下一个元素，根据该方向改变数组的下标，如果到达边界或指向的元素已经赋值，则改变方向。
* 4*4
1	2	3	4
12	13	14	5
11	16	15	6
10	9	8	7 */
public class 螺旋数组 {
    //定义全局变量
    private static final int LEFT = 1;//左
    private static final int RIGHT = 2;//右
    private static final int UP = 3;//上
    private static final int DOWN = 4;//下
    private static int direction;   //当前数字的移动方向

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            direction = RIGHT;  //每一次新的输入，让direction回归从右开始
//            createArr(n, m);
            HelicalArr(n, m);
        }
    }

    public static void createArr(int n, int m) {
        int[][] ints = new int[n][m];
        int temp = n * m;
        int value = 1;//初始值
        int row = 0, col = 0;
        ints[row][col] = value;
        while (value < temp) {
            switch (direction) {
                case RIGHT:
                    col++;//移动到下一列
                    if (col >= m || ints[row][col] != 0) {//超过边界、已经赋值
                        col--;//后退
                        row++;//移动到下一行
                        direction = DOWN;//开始向下移动
                    } else {
                        direction = RIGHT;//继续原方向移动
                    }
                    break;
                case DOWN:
                    row++;//移动到下一行
                    if (row >= n || ints[row][col] != 0) {//超过边界、已经赋值
                        row--;//后退
                        col--;//移动到前一列
                        direction = LEFT;//开始向左移动
                    } else {
                        direction = DOWN;//继续原方向移动
                    }
                    break;
                case LEFT:
                    col--;//移动到前一列
                    if (col < 0 || ints[row][col] != 0) {//超过边界、已经赋值
                        col++;//后退
                        row--;//移动到上一行
                        direction = UP;//开始向上移动
                    } else {
                        direction = LEFT;//继续原方向移动
                    }
                    break;
                case UP:
                    row--;//移动到上一行
                    if (row < 0 || ints[row][col] != 0) {//超过边界、已经赋值
                        row++;//后退
                        col++;//移动到下一列
                        direction = RIGHT;//开始向右移动
                    } else {
                        direction = UP;//继续原方向移动
                    }
                    break;
                default:
                    break;
            }
            value++;//每次移动，值加一
            ints[row][col] = value;//二维数组赋值
        }
        printMultiArr(ints);
    }

    private static void HelicalArr(int n, int m) {
        int[][] data = new int[n][m];
        int dire;   //当前数字的移动方向
        final int UP = 0;   //上
        final int DOWN = 1; //下
        final int LEFT = 2; //左
        final int RIGHT = 3;//右
        dire = RIGHT;
        int value = 1;    //数组元素的值
        int row = 0;     //第一维下标
        int col = 0;     //第二维下标
        data[0][0] = 1; //初始化第一个元素
        while (value < n * m) {
            switch (dire) {
                case UP:
                    row--; //移动到上一行
                    if (row < 0) { //超过边界
                        row++; //后退
                        dire = RIGHT;
                        continue; //跳过该次循环
                    } else if (data[row][col] != 0) {//已赋值
                        row++; //后退
                        dire = RIGHT;
                        continue; //跳过该次循环
                    }
                    break;
                case DOWN:
                    row++; //移动到下一行
                    if (row >= n) { //超过边界
                        row--; //后退
                        dire = LEFT;
                        continue; //跳过该次循环
                    } else if (data[row][col] != 0) {//已赋值
                        row--; //后退
                        dire = LEFT;
                        continue; //跳过该次循环
                    }
                    break;
                case LEFT:
                    col--; //移动到前一列
                    if (col < 0) { //超过边界
                        col++; //后退
                        dire = UP;
                        continue; //跳过该次循环
                    } else if (data[row][col] != 0) {//已赋值
                        col++; //后退
                        dire = UP;
                        continue; //跳过该次循环
                    }
                    break;
                case RIGHT:
                    col++; //移动到后一行
                    if (col >= m) { //超过边界
                        col--; //后退
                        dire = DOWN;
                        continue; //跳过该次循环
                    } else if (data[row][col] != 0) {//已赋值
                        col--; //后退
                        dire = DOWN;
                        continue; //跳过该次循环
                    }
                    break;
            }
            value++; //数值增加1
            data[row][col] = value;//赋值
        }
        printMultiArr(data);
    }
}
