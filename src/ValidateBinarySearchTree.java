import base.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by codez on 2017/10/16.
 *
 * 98. Validate Binary Search Tree
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 * 2
 *  / \
 * 1   3
 * Binary tree [2,1,3], return true.
 * Example 2:
 * 1
 * / \
 * 2   3
 * Binary tree [1,2,3], return false.
 */
public class ValidateBinarySearchTree {
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
        ValidateBinarySearchTree v = new ValidateBinarySearchTree();
        System.out.println("result:" + v.isValidBST(n1));
    }

    //more better solution
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode preNode = null;
        while (root!=null||!stack.isEmpty()){
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (preNode != null && preNode.val >= root.val) {
                return false;
            }
            preNode = root;
            root = root.right;
        }
        return true;
    }

    //solution with recursive
//    public boolean isValidBST(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        in(root);
//        int tmp = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) <= tmp) {
//                return false;
//            }
//            tmp = list.get(i);
//        }
//        return true;
//    }
//    List<Integer> list = new ArrayList<Integer>();
//
//    public void in(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        in(root.left);
//        list.add(root.val);
//        in(root.right);
//    }
}
