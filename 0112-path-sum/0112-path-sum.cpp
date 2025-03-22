
class Solution {
public:
    bool hasPathSum(TreeNode* root, int sum) {
        if(root==NULL) return false;
        int s=sum-root->val;
        if(root->left==NULL && root->right==NULL){
            if(s==0) return true;
            else false;
        }
        bool l=hasPathSum(root->left,s);
        bool r=hasPathSum(root->right,s);
        return l || r;
    }
};