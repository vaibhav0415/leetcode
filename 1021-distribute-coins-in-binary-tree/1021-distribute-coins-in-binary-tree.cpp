class Solution {
public:
  
    int distributeCoins(TreeNode* root) {
           int moves=0;
         distribute(root,moves);
         return moves;
    }
     int distribute(TreeNode* root,int &moves){
        if(root==NULL) return 0;
        int  l=distribute(root->left,moves);
        int r=distribute(root->right,moves);
        moves+=abs(l)+abs(r);
        return (l+r+root->val)-1;
     }
};