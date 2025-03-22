
class Solution {
public:
    int sumNumbers(TreeNode* root) {
     
       return dfs(root,0);
    }
    int dfs(TreeNode* root,int sum){
        if(root==NULL) return 0;
        sum=sum*10+root->val;
        if(root->left==NULL && root->right==NULL) return sum;
        int a=dfs(root->left,sum);
        int b=dfs(root->right,sum);
        return a+b;
    }
};