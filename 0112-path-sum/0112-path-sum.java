
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        int s=targetSum-root.val;
        if(root.left==null && root.right==null){
            if(s==0) return true;
            else  return false;
            }
        boolean l=hasPathSum(root.left,s);
        boolean r=hasPathSum(root.right,s);
        return l|| r;
    }
}