class Solution {
public:
    
    int result = -1; // To store the k-th smallest element

    void inorder(TreeNode* root, int &k) {
        if (root == NULL) return;
        
        inorder(root->left, k);
        
           k--;
        if (k==0) {
            result = root->val;
            return;
        }
        
        inorder(root->right, k);
    }
    
    int kthSmallest(TreeNode* root, int k) {
        inorder(root, k);
        return result;
    }
};
