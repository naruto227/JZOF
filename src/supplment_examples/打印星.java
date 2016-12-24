package supplment_examples;

/**
 * Created by hzq on 16-12-24.
 */
public class 打印星 {
    public static void main(String[] args) {
        printStar();
    }

    public static void printStar() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
