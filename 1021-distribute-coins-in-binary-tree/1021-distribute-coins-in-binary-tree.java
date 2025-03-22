class Solution {
    int moves = 0;
    public int distributeCoins(TreeNode root) {

        
        distribute(root);
        return moves;
    }

    int distribute(TreeNode root){
        if(root==null) return 0;
        int  l=distribute(root.left);
        int r=distribute(root.right);
        moves+=Math.abs(l)+Math.abs(r);
        return (l+r+root.val)-1;
     }
}
