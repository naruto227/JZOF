package array_list;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-27.
 */
//可以扩展到歌手最终排名情形
/* 要求：在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，去掉一个最高分，去掉一个最低分，
然后剩余的8位评委的分数进行平均，就是该选手的最终得分。如果已知每个评委的评分，求该选手的得分。*/
public class 歌手打分 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            Array array = new Array();
            int[] ints = array.initialization(n);
            System.out.println("该歌手所得分为：" + (double) (array.sum(ints) - array.max(ints) - array.min(ints)) / (n - 2.0));
            System.out.println(array.sum_max_min(ints)[1]);
        }
    }

}

//优化：将三个函数合并成一个函数
class Array {

    //要生成在[min,max]之间的随机整数
    public int[] initialization(int n) {
        int max = 100;
        int min = 80;
        Array array = new Array();
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (min + Math.random() * (max - min + 1));//生成n个[80,100]的数
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        return ints;
    }

    //计算出总和最大最小
    public int[] sum_max_min(int[] arr) {
        int sum = arr[0], max = sum, min = max;
        int[] ints = new int[3];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        ints[0] = sum;
        ints[1] = max;
        ints[2] = min;
        return ints;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和：" + sum);
        return sum;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值：" + max);
        return max;
    }

    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最大值：" + min);
        return min;
    }
}