
class Solution {
public:
    int minCameraCover(TreeNode* root) {
        int sum=0;
        if(dfs(root,sum)==0) sum++;// if root is not monitored, we place an additional camera here
        return sum;
        
    }
    int dfs(TreeNode* root,int &sum){
        if(root==NULL) return 1;
        int l=dfs(root->left,sum);
        int r=dfs(root->right,sum);
        if(l==0 || r==0){ // if at least 1 child is not monitored, we need to place a camera at current node 
              sum++;
              return 2;
        }
        else if(l==2 || r==2){//if at least 1 child has camera, the current node is monitored. Thus, we don't need to place a camera here
             return 1;
        }else{ //
              return 0; // if both children are monitored but have no camera, we don't need to place a camera here. We place the camera at its parent node at the higher level. 
        }
    return -1;// this return statement won't be triggered


    }
};