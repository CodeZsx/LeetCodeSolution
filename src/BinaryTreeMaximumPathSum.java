import base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codez on 2017/10/16.
 *
 * 124. Binary Tree Maximum Path Sum
 * Given a binary tree, find the maximum path sum.
 *
 * For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.
 *
 * For example:
 * Given the below binary tree,
 *
 * 1
 * / \
 * 2   3
 * Return 6.
 */
public class BinaryTreeMaximumPathSum {
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
        BinaryTreeMaximumPathSum b = new BinaryTreeMaximumPathSum();
        System.out.println("result:" + b.maxPathSum(n1));
    }

    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        looper(root);
        return max;
    }
    int max = 0;
    public int looper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, looper(root.left));
        int right = Math.max(0, looper(root.right));
        max = Math.max(max, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
