class Solution {
    List<Integer> ls = new ArrayList<>();

    int printkfar(TreeNode root, TreeNode target, int k) {
        if (root == null) return -1;
        
        // If the current node is the target node
        if (root == target) {
            printkdown(root, k);
            return 0;
        }
        
        // Check in the left subtree
        int dl = printkfar(root.left, target, k);
       
        if (dl != -1) {
            if (dl + 1 == k) {
                ls.add(root.val);
            } else {
                printkdown(root.right, k - dl - 2);
            }
            return 1 + dl;
        }
        
        // Check in the right subtree
        int dr = printkfar(root.right, target, k);
        if (dr != -1) {
            if (dr + 1 == k) {
                ls.add(root.val);
            } else {
                printkdown(root.left, k - dr - 2);
            }
            return 1 + dr;
        }
        
        return -1;
    }

    void printkdown(TreeNode root, int k) {
        if (root == null || k < 0) return;
        if (k == 0) {
            ls.add(root.val);
            return;
        }
        printkdown(root.left, k - 1);
        printkdown(root.right, k - 1);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        printkfar(root, target, k);
        return ls;
    }
}
