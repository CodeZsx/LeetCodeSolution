import base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codez on 2017/10/14.
 *
 * 95. Unique Binary Search Trees II
 * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 *
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 *
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 */
public class UniqueBinarySearchTreesII {
    public static void main(String args[]) {
        UniqueBinarySearchTreesII u = new UniqueBinarySearchTreesII();

        List<TreeNode> result = u.generateTrees(3);
        for (TreeNode node :result) {
            TreeNode.printFirst(node);//前序打印
            System.out.println("-------");
        }
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNode>();
        }
        return loop(1, n);
    }

    public List<TreeNode> loop(int start, int end) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (start > end) {
            list.add(null);
            return list;
        } else if (start == end) {
            list.add(new TreeNode(start));
            return list;
        }
        List<TreeNode> left, right;
        for (int i = start; i <= end; i++) {
            left = loop(start, i-1);
            right = loop(i + 1, end);
            for (TreeNode nodeL : left) {
                for (TreeNode nodeR : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = nodeL;
                    root.right = nodeR;
                    list.add(root);
                }
            }
        }
        return list;
    }

}
