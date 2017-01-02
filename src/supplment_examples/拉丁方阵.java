package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-2.
 */
/*要求：实现任意阶拉丁矩阵的存储和输出
* 拉丁矩阵是一种规则的数值序列，例如4阶的拉丁矩阵如下所示：
1         2 3 4
2         3 4 1
3         4 1 2
4         1 2 3
实现思路：声明一个变量n，代表矩阵的阶，声明和初始化一个nXn的数组，根据数据的规律，则对应的数值为(行号 + 列号 + 1)，当数值比n大时，取和n的余数。*/
public class 拉丁方阵 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            solution(n);
        }
    }

    public static void solution(int n) {
        int[][] ints = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j + 1 > n) {
                    ints[i][j] = (i + j + 1) % n;
                } else {
                    ints[i][j] = i + j + 1;
                }
            }
        }
        printMultiArr(ints);
    }
//    arr.length
    public static void printMultiArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    /* //输出数组的值
                   for(int row = 0;row < arr.length;row++){
                            for(int col = 0;col < arr[row].length;col++){
                                     System.out.print(arr[row][col]);
                                     System.out.print(' ');
                            }
                            System.out.println();
                   }*/
}
