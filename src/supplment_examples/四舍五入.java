package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-10.
 */
public class 四舍五入 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextFloat()) {
            float aFloat = scanner.nextFloat();
//            Math.round()
            System.out.println(solution(aFloat));
        }
    }

    private static int solution(float aFloat) {
        int num = (int) aFloat;
        float a = aFloat - num;
        if (a >= 0.5) {
            return num + 1;
        } else {
            return num;
        }
    }
}
