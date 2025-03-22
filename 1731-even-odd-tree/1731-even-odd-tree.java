
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int a=0;
        int b=0;
          boolean ltor=true;
        while(q.size()>0){
            int l=q.size();
          
            b=ltor?0:1000001;
            for(int i=0;i<l;i++){
                TreeNode curr=q.poll();
                if(ltor){
                if( curr.val%2==0  || curr.val<=b){
                       return false;
                }}
                else{
                    if( curr.val%2!=0  || curr.val>=b){
                       return false;
                }
                }


                if(curr.left!=null) {
                    q.add(curr.left);
                    
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                b=curr.val;
            }
            ltor=!ltor;
            
        }   
        return true;     
    }
}