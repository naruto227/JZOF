package supplment_examples;
//引入array_list包下的Array类

import array_list.Array;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-27.
 */
/*
要求：设有一数组A，长度是N，内部的数据是0到N-1之间的所有数字，例如当N等于5时，数组为：A={0,3,2,1,4}。针对A数组，有一个对应的编码数组B，B的长度和A的长度相等，规定数组B中元素的值规定如下：
a、 B[0]的值为0
b、 B[i]的值是A数组中A[i]以前的值中比A[i]小的元素的个数。
c、 例如示例中A数组{0,3,2,1,4}对应的编码数组B的值为{0,1,1,1,4}
*/
public class 数组编码 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();//要生成的数组元素个数
            int min = scanner.nextInt();//数组值的范围[min,max]
            int max = scanner.nextInt();
            Array array = new Array();
            int[] ints = array.initialization(n, min, max);
//            print_arr(ints);
            print_arr(createaArrB(ints));
        }
    }

    public static int[] createaArrB(int[] arr) {
        int len = arr.length;
        int[] arr_b = new int[len];
        arr_b[0] = arr[0];
        for (int i = 1; i < len; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[i]){
                    count++;
                }
            }
            arr_b[i] = count;
        }
        return arr_b;
    }

    public static void print_arr(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
