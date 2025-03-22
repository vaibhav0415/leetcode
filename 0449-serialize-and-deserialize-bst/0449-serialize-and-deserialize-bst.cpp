class Codec {
public:
    string serialize(TreeNode* root) {
         if (!root) return "";
        string s = "";
        queue<TreeNode*> q;
        q.push(root);
        while (!q.empty()) {
            TreeNode* curr = q.front();
            q.pop();
            if (curr == NULL) {
                s += "null,";
            } else {
                s += to_string(curr->val) + ",";
                q.push(curr->left);
                q.push(curr->right);
            }
        }
        if (!s.empty()) s.pop_back();
        return s;
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
         if (data.empty()) return NULL;
        stringstream s(data);
        string str;
        getline(s, str, ',');
        TreeNode* root = new TreeNode(stoi(str));
        queue<TreeNode*> q;
        q.push(root);
        while (!q.empty()) {
            TreeNode* curr = q.front();
            q.pop();

            // Process left child
            if (getline(s, str, ',')) {
                if (str == "null") {
                    curr->left = NULL;
                } else {
                    TreeNode* left = new TreeNode(stoi(str));
                    curr->left = left;
                    q.push(left);
                }
            }

            // Process right child
            if (getline(s, str, ',')) {
                if (str == "null") {
                    curr->right = NULL;
                } else {
                    TreeNode* right = new TreeNode(stoi(str));
                    curr->right = right;
                    q.push(right);
                }
            }
            }
            return root;
    }
};

// Your Codec object will be instantiated and called as such:
// Codec* ser = new Codec();
// Codec* deser = new Codec();
// string tree = ser->serialize(root);
// TreeNode* ans = deser->deserialize(tree);
// return ans;