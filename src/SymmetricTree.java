import base.TreeNode;

/**
 * Created by codez on 2017/10/14.
 *
 * 101. Symmetric Tree
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 */
public class SymmetricTree {
    public static void main(String args[]) {
//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);
//        n1.left = n2;
//        n1.right = n3;
//        n2.left = n2.right = n3.left = n3.right = null;

//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);
//        TreeNode n4 = new TreeNode(3);
//        TreeNode n5 = new TreeNode(2);
//        n1.left = n2;
//        n1.right = n3;
//        n2.left = n4;
//        n2.right = null;
//        n3.left = n5;
//        n3.right = null;
//        n4.left = n4.right = n5.left = n5.right = null;

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

        SymmetricTree s = new SymmetricTree();
        System.out.println("result:"+s.isSymmetric(n1));

    }
    public boolean isSymmetric(TreeNode root) {
        return root == null||loop(root.left, root.right);
    }
    public boolean loop(TreeNode left, TreeNode right){
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return loop(left.left, right.right) && loop(left.right, right.left);
    }
}
