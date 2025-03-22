class Solution {
    int maxlevel;
    public List<Integer> rightSideView(TreeNode root) {
          List<Integer> ls=new ArrayList<>();
          print(ls,root,1);
          return ls;
          
    }
    public void print(List<Integer> ls,TreeNode root,int level){
        if(root==null) return ;

        if(maxlevel<level){
            ls.add(root.val);
            maxlevel=level;
        }

        print(ls,root.right,level+1);
        print(ls,root.left,level+1);
    }
}