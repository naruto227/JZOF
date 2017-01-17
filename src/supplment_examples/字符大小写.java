package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-10.
 */
public class 字符大小写 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.next();
            System.out.println(toUpperCase(next));
        }
    }

    private static String toUpperCase(String str) {
        StringBuffer s = new StringBuffer();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
//                isUpperCase isLowerCase
                if (c >= 'a' && c <= 'z') {
                    c -= 32;
                }
                s.append(c);//sb.append(Character.toUpperCase(c));
            }
        }
        return s.toString()/*String.valueOf(s)*/;
    }
}
