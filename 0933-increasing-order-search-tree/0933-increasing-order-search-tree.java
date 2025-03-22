class Solution {
    private void helper(TreeNode root, TreeNode[] dummy) {
        if (root == null) {
            return;
        }
        helper(root.left, dummy);
        dummy[0].right = new TreeNode(root.val);
        dummy[0] = dummy[0].right;
        helper(root.right, dummy);
    }
    
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        TreeNode[] current = new TreeNode[] { dummy };
        helper(root, current);
        return dummy.right;
    }
}