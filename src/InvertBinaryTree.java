import base.TreeNode;

/**
 * Created by codez on 2017/10/16.
 *
 * 226. Invert Binary Tree
 * Invert a binary tree.
 *
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * to
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 */
public class InvertBinaryTree {
    public static void main(String args[]) {
        /**
         *    4
         *   / \
         *  2  5
         * / \  \
         *1  3  6
         */
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = null;
        n3.right = n6;
        n4.left = n4.right = n5.left = n5.right = n6.left = n6.right = null;
        InvertBinaryTree i = new InvertBinaryTree();
        TreeNode.printMid(n1);
        System.out.println();
        TreeNode.printMid(i.invertTree(n1));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
