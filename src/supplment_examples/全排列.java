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
            /*if (n < 1) {
                //异常代码
            }
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = i + 1;
            }*/
            int[] ints = new int[]{1, 2, 2, 3, 3};
            allArranged(ints, 0, ints.length - 1);
//            allArranged1(ints, ints.length);
//            allArranged2(ints, 0, ints.length);
            System.out.println("总共" + factorial(n) + "次");
        }
    }
/**
 *（A、B、C、D）的全排列为

 1、A后面跟（B、C、D）的全排列

 2、B后面跟（A、C、D）的全排列

 3、C后面跟（A、B、D）的全排列

 4、D后面跟（A、B、C）的全排列

 而对1中的（B、C、D）照样可以按照上面的形式进行分解。
 */
    /**
     * 无重复全排列
     *
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

    /**
     * 非递归全排列算法,即按字典序排列算法。
     * 基本思想是:
     * 1.对初始队列进行排序，找到所有排列中最小的一个排列Pmin。
     * 2.找到刚刚好比Pmin大比其它都小的排列P(min+1)。
     * 3.循环执行第二步,直到找到一个最大的排列,算法结束。
     * 如排列ABCDE，这是所有排列中最小的一个排列，刚好比ABCDE大的排列是：ABCED。
     * 算法如下：
     * 给定已知序列P =  A1A2A3.....An
     * 对P按字典排序，得到P的一个最小排列Pmin = A1A2A3....An ，满足Ai > A(i-1) (1 < i <= n)
     * 从Pmin开始,找到刚好比Pmin大的一个排列P(min+1)，再找到刚好比P(min+1)大的一个排列，如此重复。
     * 1.从后向前（即从An->A1）,找到第一对为升序的相邻元素，即Ai < A(i+1)。
     * 若找不到这样的Ai，说明已经找到最后一个全排列，可以返回了。
     * 2.从后向前,找到第一个比Ai大的数Aj，交换Ai和Aj。
     * 3.将排列中A(i+1)A(i+2)....An这个序列的数逆序倒置，即An.....A(i+2)A(i+1)。因为由前面第1、2可以得知，A(i+1)>=A(i+2)>=.....>=An,这为一个升序序列，应将该序列逆序倒置，所得到的新排列才刚刚好比上个排列大。
     * 4.重复步骤1-3,直到返回。
     */
    public static void allArranged1(int[] arr, int length) {
        if (length < 2) {
            return;
        }

        while (true) {
            print_arr(arr);

            int i, j;
            //找到不符合趋势的元素的下标i
            for (i = length - 2; i >= 0; --i) {
                if (arr[i] < arr[i + 1]) {
                    break;
                }
            }
            /**
             * 到最大一种情况时,i=-1,返回
             */
            if (i == -1) {
                return;
            }
            for (j = length - 1; j > i; j--) {
                if (arr[j] > arr[i]) {
                    break;
                }
            }

            swap(arr, i, j);
            reverse(arr, i + 1, length - 1);
        }
    }

    //将数组a中的下标i到下标j之间的所有元素逆序倒置
    private static void reverse(int[] arr, int i, int j) {
        for (; i < j; ++i, --j) {
            swap(arr, i, j);
        }
    }

    //    去掉重复的全排列的递归实现
    public static void allArranged2(int[] arr, int begin, int end) {
        if (begin == end) {
            print_arr(arr);
        } else {
            for (int i = begin; i < end; i++) {
                if (isRepeat(arr, begin, i)) {
                    swap(arr, i, begin);
                    allArranged2(arr, begin + 1, end);
                    swap(arr, i, begin);
                }
            }
        }
    }

    private static boolean isRepeat(int[] arr, int begin, int end) {
        for (int i = begin; i < end; i++) {
            if (arr[i] == arr[end]) {
                return false;
            }
        }
        return true;
    }
}
