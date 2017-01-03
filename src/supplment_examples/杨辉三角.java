package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-2.
 */
public class 杨辉三角 {
    public static void main(String[] args) {
//        拉丁方阵 ld = new 拉丁方阵();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            createYHTriangle(n);
//            ld.printMultiArr(createYHTriangle(n));
        }
    }

    public static void createYHTriangle(int n) {
        int[][] ints = new int[n][n];
        for (int i = 0; i < n; i++) {
            ints[i][0] = 1;
//            ints[i][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                ints[i][j] = ints[i - 1][j] + ints[i - 1][j - 1];
            }
        }
        printYHTri(ints);
    }

    /*                   //循环赋值
                       for(int row = 0;row < arr.length;row++){
                                for(int col = 0;col <= row;col++){
                                         if(col == 0){ //第一列
                                                   arr[row][col] = 1;
                                         }else{
                                                   arr[row][col] = arr[row - 1][col] + arr[row - 1][col - 1];
                                         }
                                }
                       }*/
    private static void printYHTri(int[][] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i][j] == 0) {
                    break;
                }
                System.out.printf(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
