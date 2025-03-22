/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
         Queue<TreeNode> q=new LinkedList<>();
         q.add(root);
         List<Double> ls=new ArrayList<>();
         while(q.size()>0){
            double sum=0;
            int nodes=0;
            int l=q.size();
            for(int i=0;i<l;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;
                nodes++;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
                ls.add(sum/nodes);
            
            
         } 
         return ls;
    }
}