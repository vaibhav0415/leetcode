
class Solution {
      boolean flag=true;
      TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
       
         in(root);
         return flag;
    } 
    public void in(TreeNode root){
        if(root==null ) return ;
        in(root.left);
        if(prev!=null){
        if(prev.val>=root.val){
            flag=false;
            return;
        }}
        prev=root;
        in(root.right);

    }
}