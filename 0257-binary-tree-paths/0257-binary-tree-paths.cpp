
class Solution {
public:
    void  helper(TreeNode* root,string ans,vector<string> &lst){
        if(root==NULL) return;
         string s=to_string(root->val);
        if(root->left==NULL && root->right==NULL){
            ans+=s;
            lst.push_back(ans);
            return;
        }
          
           helper(root->left,ans+s+"->",lst);
           helper(root->right,ans+s+"->",lst);


    }
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> lst;
        helper(root,"",lst);
        return lst;
    }
};