package supplment_examples;

import java.util.Scanner;

import static sort.BubbleSort.swap;
import static supplment_examples.数组编码.print_arr;
import static supplment_examples.计算阶乘.factorial;

/**
 * Created by hzq on 17-1-11.
 */
public class 全排列 {
    //    BubbleSort bubbleSort = new BubbleSort();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = i + 1;
            }
            allArranged(ints, 0, n - 1);
            System.out.println("总共" + factorial(n) + "次");
        }
    }
/*
（A、B、C、D）的全排列为

1、A后面跟（B、C、D）的全排列

2、B后面跟（A、C、D）的全排列

3、C后面跟（A、B、D）的全排列

4、D后面跟（A、B、C）的全排列

而对1中的（B、C、D）照样可以按照上面的形式进行分解。
 */
    /**
     * 无重复全排列
     * @param arr
     * @param begin
     * @param end
     */
    public static void allArranged(int[] arr, int begin, int end) {
        if (begin == end) {
            //打印
            print_arr(arr);
        } else {
            //for循环遍历该排列中第一个位置的所有可能情况
            for (int i = begin; i <= end; i++) {
                swap(arr, i, begin);
                allArranged(arr, begin + 1, end);
                swap(arr, i, begin);
            }
        }
    }


}
