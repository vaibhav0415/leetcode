class Solution {
public:
   // dp on binary search
    int lengthOfLIS(vector<int>& nums) {
         int n=nums.size();
         vector<int>ans;
         ans.push_back(nums[0]);
         for(int i=0;i<n;i++){
             if(nums[i]>ans.back()) ans.push_back(nums[i]);
             else {
                // find index of just bada element in ans
                int index=lower_bound(ans.begin(),ans.end(),nums[i])-ans.begin();
                ans[index]=nums[i];

             }
         }
         return ans.size();

    }
};