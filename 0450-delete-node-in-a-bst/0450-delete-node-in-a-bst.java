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
   TreeNode iop(TreeNode root){
        TreeNode pred=root.left;
        while(pred.right!=null){
            pred=pred.right;
        }
        return pred;
    }
    TreeNode ios(TreeNode root){
        TreeNode suc=root.right;
        while(suc.left!=null){
            suc=suc.left;
        }
        return suc;
    }
    TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
         if(root.val==key){
            //0 child
            if(root.right==null && root.left==null){
                return null;
            }
            //1 child
            if(root.right==null || root.left==null){
                if(root.left!=null) return root.left;
                else return root.right;
            }
            //2 child
            //replace root with inorder pred/inorder succ
            if(root.right!=null && root.left!=null){
                TreeNode pred=iop(root);
                root.val=pred.val;
                root.left=deleteNode(root.left,pred.val);
                            }
            
         }
         else if(root.val>key){
            root.left=deleteNode(root.left,key);
         }
         else{
            root.right=deleteNode(root.right,key);
         }
         return root;
    }
}