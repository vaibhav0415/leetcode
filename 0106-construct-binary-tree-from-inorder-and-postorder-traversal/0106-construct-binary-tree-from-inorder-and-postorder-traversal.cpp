
class Solution {
public:
    TreeNode* build(vector<int>& in,int inlo,int inhi, vector<int>& post, int postlo,int posthi){
                    if(inlo>inhi) return NULL;
                    TreeNode* root=new  TreeNode(post[posthi]);
                    if(postlo==posthi) return root;
                    int i=inlo;
                    while(i<=inhi){
                        if(in[i]==post[posthi]) break;
                        i++;
                    }
                    int leftCount=i-inlo;
                    int rightCount=inhi-i;
                    root->left=build(in,inlo,i-1,post,postlo,postlo+leftCount-1);
                    root->right=build(in,i+1,inhi,post,postlo+leftCount,posthi-1);
                    return root;

    }
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
             int n=inorder.size();
             return build(inorder,0,n-1,postorder,0,n-1);
    }
};