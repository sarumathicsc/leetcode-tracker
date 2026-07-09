// Last updated: 7/9/2026, 7:41:30 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    private long totalSum = 0;
    private long maxProduct = 0;
    private static final int MOD = 1_000_000_007;

    private long computeTotalSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + computeTotalSum(node.left) + computeTotalSum(node.right);
    }

    private long computeSubtreeSum(TreeNode node) {
        if (node == null) return 0;
        long leftSum = computeSubtreeSum(node.left);
        long rightSum = computeSubtreeSum(node.right);
        long subSum = node.val + leftSum + rightSum;

        long product = subSum * (totalSum - subSum);
        maxProduct = Math.max(maxProduct, product);

        return subSum;
    }

    public int maxProduct(TreeNode root) {
        totalSum = computeTotalSum(root);   
        computeSubtreeSum(root);            
        return (int)(maxProduct % MOD);     
    }
}