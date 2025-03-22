class Solution {
    public void helper(TreeNode  root,List<List<Integer>> ans,List<Integer> ls,int sum){
        if(root==null) return;
         ls.add(root.val);
         if(root.right==null && root.left==null){
            if(sum==root.val){

                 ans.add(new ArrayList<>(ls));
                // return;
            }
           
         }

         helper(root.left,ans,ls,sum-root.val);
         helper(root.right,ans,ls,sum-root.val);
         ls.remove(ls.size()-1)
;    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>> ans=new ArrayList<>(); 
    //   List<Integer> ls=new ArrayList<>();
       helper(root,ans,new ArrayList<>(),targetSum);    
       return ans;
     }
}