class Solution {
public:
    int pivotIndex(vector<int>& nums) {
         int n=nums.size();
         vector<int> pre(n);
         pre[0]=nums[0];
         for(int i=1;i<n;i++) pre[i]=pre[i-1]+nums[i];

       
         int rightsum=0;
         int leftsum=0;
        for(int i=0;i<n;i++){//O(1)
             if(i==0) leftsum=0;
             else leftsum=pre[i-1];
             rightsum=pre[n-1]-pre[i];
             if(leftsum==rightsum){
                return i;
                break;
             }
        }
        return -1;
         
    }
};