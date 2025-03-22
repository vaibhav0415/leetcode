class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         int n=inorder.length;
         return print(inorder,0,n-1,postorder,0,n-1);

        }
        public TreeNode print(int[] in,int inlo,int inhi,int[] post,int postlo,int posthi){
             if(inlo>inhi) return null;
                    TreeNode root=new  TreeNode(post[posthi]);
                    if(postlo==posthi) return root;
                    int i=inlo;
                    while(i<=inhi){
                        if(in[i]==post[posthi]) break;
                        i++;
                    }
                    int leftCount=i-inlo;
                    int rightCount=inhi-i;
                    root.left=print(in,inlo,i-1,post,postlo,postlo+leftCount-1);
                    root.right=print(in,i+1,inhi,post,postlo+leftCount,posthi-1);
                    return root;
        }
}