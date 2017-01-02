package array_list;

/**
 * Created by hzq on 17-1-2.
 */
public class Multi_arr {
    /*多维数组的声明：
                   数据类型[][] 数组名称;
                   数据类型[] 数组名称[];
                   数据类型   数组名称[][];
                    int[][] map;
                    char c[][];*/
//    在该代码中，m.length代表m数组第一维的长度，内部的m[i]指每个一维数组元素，m[i].length是m[i]数组的长度，把这些长度相加就是数组m中总的元素个数。
    public static void getLen() {
        int[][] m = {
                {1, 2, 3, 1},
                {1, 3},
                {3, 4, 2}
        };
        int sum = 0;
        for (int i = 0; i < m.length; i++) { //循环第一维下标
            sum += m[i].length;     //第二维的长度相加
        }
    }
}
