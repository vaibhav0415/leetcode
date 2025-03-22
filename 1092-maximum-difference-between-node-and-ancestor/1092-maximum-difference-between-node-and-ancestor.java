class Solution {
    int findmaxdiff(TreeNode root,int max,int min){
        if(root==null){
            return Math.abs(min-max);
        }
        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        int l=findmaxdiff(root.left,max,min);
        int r=findmaxdiff(root.right,max,min);
        return Math.max(l,r);
    }
    public int maxAncestorDiff(TreeNode root) {
         return findmaxdiff(root,root.val,root.val);

    }
}