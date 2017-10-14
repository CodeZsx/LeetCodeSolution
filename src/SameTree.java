import base.TreeNode;

/**
 * Created by codez on 2017/10/14.
 *
 * 100. Same Tree
 * Given two binary trees, write a function to check if they are equal or not.
 *
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {
    public static void main(String args[]) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q == null || p == null && q != null) {
            return false;
        } else if (p == null && q == null) {
            return true;
        }
        if (!isSameTree(p.left, q.left)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        if (!isSameTree(p.right, q.right)) {
            return false;
        }
        return true;
    }
}
