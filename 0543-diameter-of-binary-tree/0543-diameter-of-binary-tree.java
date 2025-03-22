
class Solution {
    public  int height(TreeNode root){
        if(root==null)  return 0;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)  return 0;
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int lsh = height(root.left);
        int rsh = height(root.right);
        int sd = lsh + rsh;
        return Math.max(sd,Math.max(ld,rd));
    }
}