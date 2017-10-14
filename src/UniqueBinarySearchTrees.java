/**
 * Created by codez on 2017/10/14.
 *
 * 96. Unique Binary Search Trees
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 *
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 *
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 */
public class UniqueBinarySearchTrees {
    public static void main(String args[]) {
        UniqueBinarySearchTrees u = new UniqueBinarySearchTrees();
        System.out.println("result:" + u.numTrees(3));
    }

    public int numTrees(int n) {
        int[] result = new int[n + 1];
        result[0] = result[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[i] += result[j - 1] * result[i - j];
            }
        }
        return result[n];
    }
}
