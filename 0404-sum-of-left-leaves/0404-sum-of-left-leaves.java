
class Solution {
    int solve(TreeNode root,TreeNode parent){
        if(root==null) return 0;
        if(root.left==null && root.right==null &&  parent!=null &&parent.left==root ){
            return root.val;
        }
        return solve(root.left,root)+solve(root.right,root);
    }
    public int sumOfLeftLeaves(TreeNode root) {
         return solve(root,null);
    }
}