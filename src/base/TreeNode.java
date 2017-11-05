package base;

/**
 * Created by codez on 2017/10/14.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x){
        val = x;
    }

    public static void printFirst(TreeNode root) {
        if (root == null) {
            System.out.print(" null");
            return;
        }
        System.out.print(" "+root.val);
        printFirst(root.left);
        printFirst(root.right);
    }
    public static void printMid(TreeNode root){
        if (root == null) {
            System.out.print(" null");
            return;
        }
        printMid(root.left);
        System.out.print(" "+root.val);
        printMid(root.right);
    }
    public static void printPost(TreeNode root){
        if (root == null) {
            System.out.print(" null");
            return;
        }
        printMid(root.left);
        printMid(root.right);
        System.out.print(" "+root.val);
    }
}
