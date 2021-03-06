package array_list;

/**
 * Created by hzq on 16-12-27.
 */
//优化：将三个函数合并成一个函数
//    数组的length是array的属性，在数组创建时就有
public class Array {

    //要生成在[min,max]之间的随机整数
    public int[] initialization(int n, int min, int max) {
//        int max = 100;
//        int min = 80;
//        Array array = new Array();
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (min + Math.random() * (max - min + 1));//生成n个[80,100]的数
//            System.out.print(ints[i] + " ");
        }
//        System.out.println();
        return ints;
    }

    //    生成[0,100]长度为n的数组
    public int[] initialization(int n) {
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = (int) (Math.random() * 90) + 10;
        }
        return ints;
    }

    //    生成一个二维数组
    public int[][] createTwoDimenArr(int n, int m) {
        int[][] ints = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ints[i][j] = (int) (Math.random()*5);
            }
        }
        return ints;
    }

    //计算出总和最大最小
    public int[] sum_max_min(int[] arr) {
        int sum = arr[0], max = sum, min = max;
        int[] ints = new int[3];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
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