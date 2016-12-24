package supplment_examples;

import java.util.Scanner;

/**
 * 在控制台打印数学上的99乘法表
 * Created by hzq on 16-12-23.
 */
public class 九九乘法表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            solution(num);
        }
    }
//正三角
    public static void solution(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.printf(j + "*" + i + "=" + i * j + "\t");
                if(i == j){
                    System.out.println();
                    break;
                }
            }
        }
    }
}
