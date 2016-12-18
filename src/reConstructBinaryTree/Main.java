package reConstructBinaryTree;


/**
 * Created by hzq on 16-12-9.
 */
public class Main {
    public static void main(String[] args) {
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        Solution solution = new Solution();
        System.out.println("前序遍历结果：");
        printPreOrder(solution.reConstructBinaryTree(preOrder, inOrder));
        System.out.println();
        System.out.println("中序遍历结果：");
        printInOrder(solution.reConstructBinaryTree(preOrder, inOrder));
        System.out.println();
        System.out.println("后序遍历结果：");
        printAfterOrder(solution.reConstructBinaryTree(preOrder, inOrder));
    }

    //  前序遍历方式
    public static void printPreOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.val + " ");
        }

        if (root.left != null) {
            printPreOrder(root.left);
        }

        if (root.right != null) {
            printPreOrder(root.right);
        }
    }

    //  中序遍历方式
    public static void printInOrder(TreeNode root) {
        if (root == null) {
            return;
        } else if (root.left != null) {
            printInOrder(root.left);
        }

        System.out.print(root.val + " ");

        if (root.right != null) {
            printInOrder(root.right);
        }
    }

    //  后序遍历方式
    public static void printAfterOrder(TreeNode root) {
        if (root == null) {
            return;
        } else if (root.left != null) {
            printAfterOrder(root.left);
        }
        if (root.right != null) {
            printAfterOrder(root.right);
        }
        System.out.print(root.val + " ");

    }
}
