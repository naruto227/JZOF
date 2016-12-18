package reConstructBinaryTree;

/**
 * Created by hzq on 16-12-9.
 */
public class Main {
    public static void main(String[] args) {
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        Solution solution = new Solution();
        solution.reConstructBinaryTree(preOrder,inOrder);
    }
}
