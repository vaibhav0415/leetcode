
class Solution {
    int max=0;
    int post(TreeNode root){
        if(root==null) return 0;
        int l=post(root.left);
        int r=post(root.right);
       int tl=0;
       int tr=0;
        if(root.left!=null && root.left.val==root.val){
            tl+=l+1;
        }
        if(root.right!=null && root.right.val==root.val){
            tr+=r+1;
        }
        max=Math.max(max,tl+tr);
        return Math.max(tl,tr);
    }
    public int longestUnivaluePath(TreeNode root) {
         post(root);
         return max;
    }
}