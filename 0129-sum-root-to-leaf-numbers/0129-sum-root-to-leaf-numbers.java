
class Solution {
    public int sumNumbers(TreeNode root) {
      return helper(root,0);  
    }
    public int helper(TreeNode root,int sum){
        if(root==null){
            return 0;
         }
         if(root.left==null && root.right==null) return sum*10+root.val;
         sum=root.val+sum*10;
         int a=helper(root.left,sum);
         int b=helper(root.right,sum);
         return a+b;
    }
}