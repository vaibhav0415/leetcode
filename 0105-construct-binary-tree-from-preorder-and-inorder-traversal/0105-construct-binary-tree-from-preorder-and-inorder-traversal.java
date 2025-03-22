class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

       return  create(inorder,0,inorder.length-1,preorder,0,preorder.length-1,map);
    }

    public static TreeNode create(int[] inorder,int instart,int inend,int[] preorder,int prestart,int preend, Map<Integer,Integer> map){
        if(instart>inend || prestart>preend){
            return null;
        }
        TreeNode root=new TreeNode(preorder[prestart]);
        int rootidx=map.get(root.val);
        int left_elements=rootidx-instart;
        root.left=create(inorder,instart,rootidx-1,preorder,prestart+1,prestart+left_elements,map);
        root.right=create(inorder,rootidx+1,inend,preorder,prestart+left_elements+1,preend,map);
        return root;
    }
}