package supplment_examples;

/**
 * ABCD*D=DCBA,要求A,B,C,D为1-9之间的数,且D不能为1
 * Created by hzq on 17-1-12.
 * so easy,if it has a quicker method
 */
public class ABCD {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {//A
            for (int j = 0; j < 10; j++) {//B
                for (int k = 0; k < 10; k++) {//C
                    for (int l = 2; l < 10; l++) {//D
                        int a = i * 1000 + j * 100 + k * 10 + l;
                        int b = l * 1000 + k * 100 + j * 10 + i;
                        if (a * l == b) {
                            System.out.println(a + " * " + l + " = " + b);
                        }
                    }
                }
            }
        }
    }
}
