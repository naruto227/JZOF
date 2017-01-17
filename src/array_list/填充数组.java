package array_list;

import supplment_examples.计算阶乘;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-9.
 */
//使用1-9这9个数字填充一个3X3的数组，要求输出所有可能的情况。暂未理解
//静态方法内部调用非静态的结构,new 一个对象，对象名.方法名调用对应的方法
public class 填充数组 {
        static void output(int[] num, int length) {
            int i;
            for (i = length - 1; i >= 0; --i)
                System.out.print((num[i]+1) + "  ");
            System.out.println();
        }

    void permutCombi(int n) {
            int[] num, mark;
            int i, flag;
            num = new int[n + 1];
            mark = new int[n];
            for (i = 0; i <= n; ++i)
                num[i] = 0;
            do {
                for (i = 0; i < n; ++i)
                    mark[i] = 0;
                flag = 0;
                ++num[0];
                for (i = 0; i < n; ++i) {
                    if (num[i] == n) {
                        num[i] = 0;
                        ++num[i + 1];
                    }
                    ++mark[num[i]];
                    // 各位数组单元有无重复
                    if (mark[num[i]] > 1) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    output(num, n);
            } while (num[n] == 0);
        }

        public static void main(String[] args) {
            int n = 3;
            Scanner scanner = new Scanner(System.in);
            计算阶乘 计算阶乘 = new 计算阶乘();
            填充数组 填充数组 = new 填充数组();
            填充数组.permutCombi(n);
        }
    }

