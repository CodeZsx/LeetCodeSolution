import base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codez on 2017/10/16.
 *
 * 145. Binary Tree Postorder Traversal
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 * \
 * 2
 * /
 * 3
 * return [3,2,1].
 */
public class BinaryTreePostorderTraversal {
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
        BinaryTreePostorderTraversal b = new BinaryTreePostorderTraversal();
        System.out.println("result:"+b.postorderTraversal(n1));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        post(root);
        return list;
    }

    List<Integer> list = new ArrayList<Integer>();
    public void post(TreeNode root) {
        if (root == null) {
            return;
        }
        post(root.left);
        post(root.right);
        list.add(root.val);
    }
}
