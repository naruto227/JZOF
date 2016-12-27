package array_list;

/**
 * Created by hzq on 16-12-27.
 */
public class 数组是否对称 {
    public boolean arr_symmetry(int[] arr) {
        boolean flag = false;
        int len = arr.length - 1;
        int half = len / 2;
        for (int i = 0; i < half; i++) {
            if (arr[i] == arr[len - i]) {
                System.out.println("第" + i + "个元素和第" + (len - i) + "个元素对称,分别为：" + arr[i] + " " + arr[len - i]);
                flag = true;
                break;
            }
        }
        return flag;
    }
}
