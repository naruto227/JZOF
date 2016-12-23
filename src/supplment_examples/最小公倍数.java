package supplment_examples;

/**
 * Created by hzq on 16-12-23.
 */
public class 最小公倍数 {
    public static int bianli(int a, int b) {
//        int temp = a * b;
        int max = a > b ? a : b;
        int i = max;
        for (; ; i++) {
            if (i % a == 0 && i % b == 0) {
                break;
            }
        }
        return i;
    }
}
