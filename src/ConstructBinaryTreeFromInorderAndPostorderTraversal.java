import base.TreeNode;

/**
 * Created by codez on 2017/10/16.
 *
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 *
 * helper:refer to 105. Construct Binary Tree from Preorder and Inorder Traversal
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String args[]) {
        ConstructBinaryTreeFromInorderAndPostorderTraversal c = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        int[] inorder = {4, 3, 5, 2, 3, 6};
        int[] postorder = {4, 5, 3, 6, 3, 2};
        TreeNode.printMid(c.buildTree(inorder, postorder));
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return looper(0, inorder.length - 1, postorder.length - 1, inorder, postorder);
    }

    public TreeNode looper(int inStart, int inEnd, int postStart, int[] inorder, int[] postorder) {
        if (inStart > inEnd || postStart < 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postStart]);
        int rootIndex = 0;
        for (int i = inStart; i <= inEnd ; i++) {
            if (inorder[i] == root.val) {
                rootIndex = i;
            }
        }
        root.left = looper(inStart, rootIndex - 1, postStart - 1 - (inEnd - rootIndex), inorder, postorder);
        root.right = looper(rootIndex + 1, inEnd, postStart - 1, inorder, postorder);
        return root;
    }
}
