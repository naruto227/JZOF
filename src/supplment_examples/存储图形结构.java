package supplment_examples;

/**
 * Created by hzq on 17-1-3.
 */
/*要求：根据数组中的值，在对应位置绘制指定的字符。规定0绘制空格，1绘制星号(*)。*/
public class 存储图形结构 {
    public static void main(String[] args) {
        int[][] arr = {
            {0,0,0,1,0,0,0},
            {0,0,1,0,1,0,0},
            {0,1,0,0,0,1,0},
            {1,0,0,0,0,0,1},
            {0,1,0,0,0,1,0},
            {0,0,1,0,1,0,0},
            {0,0,0,1,0,0,0}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                switch (arr[i][j]){
                    case 0:
                        System.out.printf(" ");
                        break;
                    case 1:
                        System.out.printf("*");
                        break;
                }
            }
            System.out.println();
        }
    }
}
