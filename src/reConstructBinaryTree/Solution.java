package reConstructBinaryTree;

/**
 * Created by hzq on 16-12-9.
 */
public class Solution {
    /*int [] pre;
    int [] in;

    public Solution(int[] pre, int[] in) {
        this.pre = pre;
        this.in = in;
    }*/

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        int length = pre.length;
        if (pre == null || in == null || length <= 0) {
            return null;
        }

        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }

        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startPre; i < endPre; i++) {
            if (in[i] == pre[startPre]) {   // in[i]: i表示in数组下标为i的元素
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
            }
        }
        return root;
    }

}
