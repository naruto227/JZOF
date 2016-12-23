package supplment_examples;

import java.util.Scanner;

/**
 * 共有1000瓶汽水，每喝完后一瓶得到的一个空瓶子，每3个空瓶子又能换1瓶汽水，喝掉以后又得到一个空瓶子，
 * 问总共能喝多少瓶汽水，最后还剩余多少个空瓶子？
 * Created by hzq on 16-12-23.
 */
public class 喝汽水 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            solution1(num);
        }
    }

    /*每次喝一瓶，每有三个空瓶子就去换一瓶新的汽水，直到最后没有汽水可以喝为止。在程序中记忆汽水的数量和空瓶子的数量即可*/
    //num汽水数量
    public static void solution(int num) {
        int drinkNum = 0;   //喝掉的汽水数量
        int emptyNum = 0;   //空瓶子的数量
        while (num > 0) {
            num--;  //喝掉一瓶
            emptyNum++; //空瓶子数量增加1
            drinkNum++; //喝掉的汽水数量增加1
            if (emptyNum == 3) {//有3个空瓶子，则去换
                num++;  //汽水数量增加1
                emptyNum = 0;   //空瓶子数量清零
            }
        }
        System.out.println("总共喝掉瓶数：" + drinkNum);
        System.out.println("剩余空瓶子数：" + emptyNum);
    }

    /*一次把所有的汽水喝完，获得所有的空瓶子，再全部换成汽水，然后再一次全部喝完，再获得所有的空瓶子，依次类推，
    直到没有汽水可喝为止。*/
    public static void solution1(int num) {
        int drinkNum = 0;   //喝掉的汽水数量
        int emptyNum = 0;   //空瓶子的数量
        while (num > 0) {  //有汽水可以喝
            drinkNum += num;//喝掉所有的汽水
            emptyNum += num; //空瓶子数量等于上次剩余的加上这次喝掉的数量
            num = emptyNum / 3; //兑换的汽水数量
            emptyNum %= 3;//本次兑换剩余的空瓶子数量
        }
        System.out.println("总共喝掉瓶数：" + drinkNum);
        System.out.println("剩余空瓶子数：" + emptyNum);
    }
}
