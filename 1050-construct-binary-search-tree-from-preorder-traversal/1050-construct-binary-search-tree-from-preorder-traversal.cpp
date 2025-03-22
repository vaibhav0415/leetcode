
class Solution {
public:
void insert(TreeNode* root,int val){
            
            if(root->val>val){ //yani mujhko jana hai left me
                  if(root->left==NULL) {
                    root->left=new TreeNode(val);
                    return;
                    }
                    else insert(root->left,val);
            }
            else{ // root->val<val
                  // go right
                  if(root->right==NULL){
                     root->right=new TreeNode(val);
                     return;
                  }
                  else insert(root->right,val);

            }
    }
    TreeNode* bstFromPreorder(vector<int>& preorder) {
          TreeNode* root=new TreeNode(preorder[0]);
          for(int i=1;i<preorder.size();i++){
              insert(root,preorder[i]);
          }
            return root;
    }
};