class Solution {
    int helper(TreeNode* root,int& maxdia) {
        if (root == NULL)
            return 0;
        int dia = levels(root->left) + levels(root->right);
        helper(root->right,maxdia);
        helper(root->left,maxdia);
        maxdia = max(maxdia, dia);
        return maxdia;
    }
    int levels(TreeNode* root) {
        if (root == NULL)
            return 0;
        return 1 + max(levels(root->right), levels(root->left));
    }

public:
    int diameterOfBinaryTree(TreeNode* root) {
        int maxdia = 0;

         helper(root,maxdia);
        return maxdia;
            }
};