package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-10.
 */
/*对象的声明：类名 名称；对象的初始化： 类名 名称 = new 类名(构造方法参数)
Box b1;
b1 = new Box(2,3,4);
继承说明：子类拥有父类的所有属性、子类拥有父类的所有方法、子类不拥有父类的构造方法、子类类型是父类类型
*/
public class 数字字符转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.next();
            if (next.length() == 1) {
                System.out.println(invertInt(next.charAt(0)));//单个字符
            }else {
                System.out.println(sumInt(next));
            }
        }
    }

    /**
     * 将对应的数字字符(如’1’、’4’等)转换为对应数字(如1、4)的方法。如：4a5sd,)*1m3,则为4+5+1+3，结果等于13
     * @param str
     * @return
     */
    private static int invertInt(char str) {
        if ((str >= '0') && (str <= '9')) {
            return str - '0';
        } else {
            return -1;
        }
    }

    /**
     * 输入一行字符，将其中的数字字符对应的整数值加起来，并输出结果
     * @param str
     * @return
     */
    private static int sumInt(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= '0') && (c <= '9')) {
                sum += (c - '0');
            }
        }
        return sum;
    }
}
