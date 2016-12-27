package array_list;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-27.
 */
public class 数组元素是否重复 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            Array array = new Array();
            int[] ints = array.initialization(n);
            Repeat repeat = new Repeat();
            if (repeat.arr_repeat(ints)) {
                System.out.println("有重复元素");
            }else {
                System.out.println("没有重复元素");
            }

            if(new 数组是否对称().arr_symmetry(ints)){
                System.out.println("数组有对称");
            }else {
                System.out.println("数组没有对称");
            }
        }
    }
}

class Repeat {
    public boolean arr_repeat(int[] arr) {
        boolean flag = false;
        int len = arr.length;
        int len1 = len - 1;
        for (int i = 0; i < len1; i++) {
            /*if(flag){
                break;
            }*/
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("第" + i + "个元素和第" + j + "个元素重复,分别为：" + arr[i] + " " + arr[j]);
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}