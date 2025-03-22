
class Solution {
    int ans=0;
    public int sumRootToLeaf(TreeNode root) {
          print(root,0); 
          return ans;  
    }
    public void print(TreeNode root,int sum){
          if(root==null) return;
          sum=sum*2+root.val;
          if(root.right==null && root.left==null) {
               ans+=sum;
              return;
          } 
          
          
          print(root.left,sum);
          
          print(root.right,sum);
         
         
    }
    
}