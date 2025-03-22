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
    TreeNode* insertIntoBST(TreeNode* root, int val) {
        if(root==NULL) {
            root=new TreeNode(val);
            return root;
        }
                insert(root,val);
                
                return root;
    }
};