import base.TreeNode;

import java.util.Map;

/**
 * Created by codez on 2017/10/15.
 *
 * 104. Maximum Depth of Binary Tree
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {
    public static void main(String args[]) {
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = null;
        n4.left = n4.right = n5.left = n5.right = n6.left = n6.right = null;

        MaximumDepthOfBinaryTree m = new MaximumDepthOfBinaryTree();
        System.out.println("result:"+m.maxDepth(n1));
    }

    public int maxDepth(TreeNode root) {
        goDeep(root, 0);
        return max;
    }
    public int max = 0;
    public void goDeep(TreeNode root, int level) {
        if (root == null) {
            max = Math.max(max, level);
            return;
        }
        goDeep(root.left, level + 1);
        goDeep(root.right, level + 1);
    }
}
