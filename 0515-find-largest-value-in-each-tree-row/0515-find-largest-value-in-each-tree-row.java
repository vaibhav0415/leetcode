
class Solution {
    
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            int l=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<l;i++){
                TreeNode curr=q.poll();
                max=Math.max(curr.val,max);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            ls.add(max);

        }
        return ls;
    }
}