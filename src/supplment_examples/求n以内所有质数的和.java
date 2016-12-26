package supplment_examples;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hzq on 16-12-26.
 */
public class 求n以内所有质数的和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println("=" + primeSum(n));
        }
    }

    public static int primeSum(int n){
        Judge judge = new Judge();
        int sum = 0;
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if(judge.prime2(i)){
                System.out.printf(i + " ");
                ints.add(i);
                sum += i;
            }
        }
        System.out.println();
        int len = ints.size();
        for (int i = 0; i < len; i++) {
            if(i == len - 1){
                System.out.print(ints.get(i));//打印Int
            }else {
                System.out.printf(ints.get(i) + "+");//printf打印字符串
            }
        }
        return sum;
    }
}
