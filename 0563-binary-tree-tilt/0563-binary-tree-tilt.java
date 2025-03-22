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

class Solution {
    private int result = 0;

    public int findTilt(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return result;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;

        int leftSum = root.left != null ? helper(root.left) : 0;
        int rightSum = root.right != null ? helper(root.right) : 0;

        result += Math.abs(leftSum - rightSum);

        return leftSum + rightSum + root.val;
    }
}
