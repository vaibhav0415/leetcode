
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        recursion(root);
        return (second == Long.MAX_VALUE)?-1:(int)second;
    }

    long first = Long.MAX_VALUE, second = Long.MAX_VALUE;
    public void recursion(TreeNode root){
        if(root == null){
            return;
        }

        first = Math.min(root.val, first);
        if(root.val > first && root.val < second){
            second = root.val;
        }

        recursion(root.left);
        recursion(root.right);
    }
}