package com.company;

/**
 * Created by hzq on 16-12-8.
 */
public class 二维数组查询 {
    public static void main(String[] args) {
        boolean find = Find(6, new int[][]{
                {1, 2, 8, 9, 15},
                {2, 4, 9, 12, 20},
                {4, 7, 10, 13, 30},
                {6, 8, 11, 15, 50}
        });
        System.out.println(find ? "找到" : "没有");
    }

    public static boolean Find(int target, int[][] array) {
//        int len = array.length > array[0].length ? array.length : array[0].length;
        /*int j = array[0].length - 1;
        for(int i = 0; i < array.length;){
            if(i == array.length || j == -1){
                break;
            }
            int temp = array[i][j];
            if(target == temp){
                return true;
            }else if(target >temp){
                i++;
            }else {
                j--;
            }
        }
        return false;*/
        int len = array.length - 1;
        int i = 0;
        while ((len >= 0) && (i < array[0].length)) {
            if (array[len][i] > target) {
                len--;
            } else if (array[len][i] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
