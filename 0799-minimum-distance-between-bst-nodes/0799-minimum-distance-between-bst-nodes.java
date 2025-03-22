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
    int min=Integer.MAX_VALUE;
    TreeNode prev=null;
    void in(TreeNode root){
        if(root==null) return;
        in(root.left);
         if(prev!=null){
          min=Math.min(min,-prev.val+root.val);
         }
         prev=root;
        in(root.right);

    }
    public int minDiffInBST(TreeNode root) {
        in(root);
        return min;
    }
}