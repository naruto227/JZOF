package reConstructBinaryTree;

/**
 * Created by hzq on 16-12-9.
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int length = pre.length;
        if(pre == null || in == null || length <= 0){
            return null;
        }
        int rootValue = pre[0], rootIndex;
        int[] left_pre = new int[10];
        int[] left_in = new int[10];
        int[] right_pre = new int[10];
        int[] right_in = new int[10];
        TreeNode root = new TreeNode(rootValue);
        for (int i = 0; i < length; i++) {
            if(rootValue == in[i]){
                rootIndex = i;
                break;
            }
        }

        for (int i = 0; i < rootIndex; i++) {
            left_pre[i] = pre[i+1];
            right_pre[i] = in[i];
        }

        for(int i = rootIndex + 1; i < length; i++){
            right_pre[i] = pre[i];
            right_in[i] = in[i];
        }

        root.left = reConstructBinaryTree(left_pre, left_in);
        root.right = reConstructBinaryTree(right_pre, right_in);

        return root;

    }
}
