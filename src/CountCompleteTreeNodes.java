import base.TreeNode;

import java.util.Stack;

/**
 * Created by codez on 2017/10/16.
 *
 * 222. Count Complete Tree Nodes
 * Given a complete binary tree, count the number of nodes.
 *
 * Complete binary tree:
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 */
public class CountCompleteTreeNodes {
    public static void main(String args[]) {
        /**
         *    4
         *   / \
         *  2  5
         */
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n2.right = n3.left = n3.right = null;
        CountCompleteTreeNodes c = new CountCompleteTreeNodes();
        System.out.println("result:" + c.countNodes(n1));
    }

    public int countNodes(TreeNode root) {
        int leftDepth = leftDepth(root);
        int rightDepth = rightDepth(root);
        if (leftDepth == rightDepth) {
            return (1<<leftDepth)-1;//same as:(int)Math.pow(2, leftDepth)-1,but (1<<leftDepth) speeds less time
        }else{
            return 1 + countNodes(root.left) + countNodes(root.right);//root-node(1)+left-node+right-node
        }
    }

    public int leftDepth(TreeNode root) {
        int depth = 0;
        while (root != null) {
            root = root.left;
            depth++;
        }
        return depth;
    }
    public int rightDepth(TreeNode root) {
        int depth = 0;
        while (root != null) {
            root = root.right;
            depth++;
        }
        return depth;
    }
}
