/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    void helper(TreeNode* root, TreeNode* &dummy) {
        if (root == NULL)
            return;
        helper(root->left, dummy);
        dummy->right = new TreeNode(root->val);

        dummy = dummy->right;
        helper(root->right, dummy);
    }
    TreeNode* increasingBST(TreeNode* root) {
        TreeNode* dummy = new TreeNode(0);
       TreeNode* result = dummy;
        helper(root, dummy);
        return result->right;
    }
};