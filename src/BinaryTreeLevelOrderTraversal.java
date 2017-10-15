import base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codez on 2017/10/15.
 *
 * 102. Binary Tree Level Order Traversal
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its level order traversal as:
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
public class BinaryTreeLevelOrderTraversal {
    public static void main(String args[]) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        n2.left = n2.right = n4.left = n4.right = n5.left = n5.right = null;
        BinaryTreeLevelOrderTraversal b = new BinaryTreeLevelOrderTraversal();
        System.out.println("result:" + b.levelOrder(n1));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root, 0);
        return list;
    }
    public List<List<Integer>> list = new ArrayList<List<Integer>>();
    public void traverse(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (list.size() < level + 1) {
            List<Integer> l = new ArrayList<Integer>();
            l.add(root.val);
            list.add(l);
        }else{
            List<Integer> l = list.get(level);
            l.add(root.val);
            list.set(level, l);
        }
        traverse(root.left, level + 1);
        traverse(root.right, level + 1);
    }
}
