import base.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codez on 2017/10/14.
 *
 * 99. Recover Binary Search Tree
 * Two elements of a binary search tree (BST) are swapped by mistake.
 *
 * Recover the tree without changing its structure.
 */
public class RecoverBinarySearchTree {
    public static void main(String args[]) {

    }

    public void recoverTree(TreeNode root) {
        mid(root);
        //exchange first-node and second-node
        int tmp = nodeFirst.val;
        nodeFirst.val = nodeSecond.val;
        nodeSecond.val = tmp;
    }

    TreeNode nodeFirst = null;//save the first node
    TreeNode nodeSecond = null;//save second node
    TreeNode nodeLast = new TreeNode(Integer.MIN_VALUE);//save the last node
    public void mid(TreeNode root) {
        if (root == null) {
            return;
        }
        mid(root.left);
        if (root.val <= nodeLast.val) {
            if (nodeFirst==null){
                nodeFirst = nodeLast;//first root.val<nodeLast.val -> first node
            }
            if (nodeFirst != null){
                nodeSecond = root;//second root.val<nodeLast.val -> second node
            }
        }
        nodeLast = root;
        mid(root.right);
    }
}
