class Solution {
    int maxSum=0;
    int post(TreeNode root){
        if(root==null) return 0;
        int l=post(root.left);
        int r=post(root.right);
        int neeche_hi_mil_gaya_ans=l+r+root.val;
        int koi_ek_acha=Math.max(l,r)+root.val;
        int only_root_acha=root.val;
        maxSum=Math.max( maxSum,Math.max(neeche_hi_mil_gaya_ans,Math.max(koi_ek_acha,only_root_acha)));
        return Math.max(koi_ek_acha,only_root_acha);
    }
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        post(root);
        return maxSum; 
       
       }

}