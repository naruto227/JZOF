package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-10.
 */
public class fun_prac {
    public static void main(String[] args) {
//        Math.abs(-10);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println(abs(n));
        }
    }
//byte -128
    private static int abs(int n) {
        return n > 0 ? n : (-n);
    }

}
