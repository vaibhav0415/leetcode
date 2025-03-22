
class Solution {
    public:
    void invert(TreeNode* root){
          if(root==NULL) return;
          TreeNode* temp=root->left;
          root->left=root->right;
          root->right=temp;
          invert(root->left);
          invert(root->right);
    }
    bool check(TreeNode* l,TreeNode* r){
          if((l==NULL && r==NULL)) return true;
          if((l==NULL || r==NULL)  || (l->val!=r->val)) return false;
          return check(l->left,r->left) && check(l->right,r->right)
;
     }
      bool isSymmetric(TreeNode* root) {
          invert(root->left);
          return check(root->left,root->right);
    }
};