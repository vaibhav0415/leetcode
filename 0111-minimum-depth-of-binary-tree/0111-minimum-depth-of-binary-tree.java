/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int levels(TreeNode root, int level) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;
        while (q.size() > 0) {
            int l = q.size();
            for (int i = 0; i < l; i++) {
                TreeNode curr = q.poll();
                if (curr.right == null && curr.left == null) {
                    return depth;
                }
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);

            }
            depth++;
        }
        return -1;

    }

    public int minDepth(TreeNode root) {
        return levels(root, 0);
    }
}