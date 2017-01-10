package supplment_examples;

import java.util.Scanner;

/**
 * Created by hzq on 17-1-10.
 */
public class 数字字符转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String next = scanner.next();
            if (next.length()==1){
                System.out.println(invertInt(next.charAt(0)));//单个字符
            }
        }
    }

    /**
     * 将对应的数字字符(如’1’、’4’等)转换为对应数字(如1、4)的方法
     * @param str
     * @return
     */
    private static int invertInt(char str){
        if((str >= '0') && (str <= '9')){
            return str - '0';
        }else {
            return -1;
        }
    }
}
