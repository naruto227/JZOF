package supplment_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hzq on 17-1-11.
 */
public class Ymh {
        static int len = 10;
        public static int[] res = new int[len];
        public static int count = 0;
        public static List<int[]> list = new ArrayList<int[]>();

        public static void main(String[] args) {
            for (int i = 0; i < res.length; i++) {
                res[i] = i;
            }
            test(0, res);
            for (int i = 0; i < list.size(); i++) {
                if (split(list.get(i)) && count < 21) {
                    count++;
                    System.out.println(Arrays.toString(list.get(i)));
                }
            }
        }

        public static void test(int index, int[] data) {
            if (index == data.length - 1) {
//            System.out.println(Arrays.toString(data));
                int[] temp = new int[data.length];
                System.arraycopy(data, 0, temp, 0, data.length);
                list.add(temp);
                return;
            }
            for (int i = index; i < data.length; i++) {
                int temp = data[index];
                data[index] = data[i];
                data[i] = temp;
                test(index + 1, data);
                temp = data[index];
                data[index] = data[i];
                data[i] = temp;
            }
        }

        public static boolean split(int[] arr) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < arr.length / 2; i++) {
                sb1.append(arr[i]);
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                sb2.append(arr[i]);
            }
            int i1 = Integer.parseInt(sb1.toString());
            int i2 = Integer.parseInt(sb2.toString());
            if (i1 > 9999 && i2 > 9999) {
                if ((i1 * i2 + "").length() == len) {
                    return true;
                }
            }
            return false;
        }
    }

