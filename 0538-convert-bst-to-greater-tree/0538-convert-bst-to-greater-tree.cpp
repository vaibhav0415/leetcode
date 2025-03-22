
class Solution {
public:
    int sum=0;
    void reverseIn(TreeNode* root){
        if(root==NULL) return ;
        reverseIn(root->right);
        sum+=root->val;
        root->val=sum;
        reverseIn(root->left);
    
    }
    TreeNode* convertBST(TreeNode* root) {
        reverseIn(root);
        return root;
    }
};