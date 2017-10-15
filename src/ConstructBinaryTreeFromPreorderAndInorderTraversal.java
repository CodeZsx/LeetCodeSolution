import base.TreeNode;

/**
 * Created by codez on 2017/10/15.
 *
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 * helper:
 * The basic idea is here:
 * Say we have 2 arrays, PRE and IN.
 * Preorder traversing implies that PRE[0] is the root node.
 * Then we can find this PRE[0] in IN, say it's IN[5].
 * Now we know that IN[5] is root, so we know that IN[0] - IN[4] is on the left side, IN[6] to the end is on the right side.
 * Recursively doing this on subarrays, we can build a tree out of it
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String args[]) {

        ConstructBinaryTreeFromPreorderAndInorderTraversal c = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        int[] preorder = {2, 3, 4, 5, 3, 6};
        int[] inorder = {4, 3, 5, 2, 3, 6};
        TreeNode.printMid(c.buildTree(preorder, inorder));
    }
    public TreeNode buildTree(int[] preorder, int[] inorder){
        return looper(0, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode looper(int pStart, int iStart, int iEnd, int[] preorder, int[] inorder) {
        if (pStart > preorder.length - 1 || iStart > iEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pStart]);
        int rootIndex = 0;//index of current root-node in inorder
        for (int i = iStart; i <= iEnd; i++) {
            if (inorder[i] == root.val) {//find the index,which's value == root.val
                rootIndex = i;
            }
        }
        root.left = looper(pStart + 1, iStart, rootIndex - 1, preorder, inorder);
        root.right = looper(pStart + 1 + (rootIndex - iStart), rootIndex + 1, iEnd,
                preorder, inorder);
        return root;
    }
}
