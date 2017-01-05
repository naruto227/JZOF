package array_list;

import java.util.Scanner;

import static supplment_examples.拉丁方阵.printMultiArr;

/**
 * Created by hzq on 17-1-5.
 */
public class 矩阵相乘 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arrA = new Array().createTwoDimenArr(n, p);
            int[][] arrB = new Array().createTwoDimenArr(p, m);
            System.out.println("A数组：");
            printMultiArr(arrA);
            System.out.println("B数组：");
            printMultiArr(arrB);
            System.out.println("A与B乘积后的数组：");
            printMultiArr(multiArr(arrA, arrB));
        }
    }

    //两个矩阵相乘
    private static int[][] multiArr(int[][] arrA, int[][] arrB) {
        int[][] arrC = new int[arrA.length][arrB[0].length];
        for (int i = 0; i < arrA.length; i++) {//取A数组的行号
            for (int j = 0; j < arrB[0].length; j++) {//取B数组的列号
                for (int k = 0; k < arrB.length; k++) {//遍历A的列次或B的行次
                    arrC[i][j] += arrA[i][k] * arrB[k][j];
                }
            }
        }
        return arrC;
    }

}
