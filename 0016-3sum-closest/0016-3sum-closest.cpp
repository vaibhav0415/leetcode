class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
         vector<vector<int>> ans;
         int n=nums.size();
         sort(nums.begin(),nums.end());
         int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.size();i++){
              if(i>0 && nums[i]==nums[i-1])  continue;
              int j=i+1;
              int k=n-1;
              while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(abs(closest-target)>abs(target-sum)){
                        closest=sum;
                    }
                    if(sum<target){
                         j++;
                    }else if(sum>target){
                         k--;
                    }else{
                         vector<int> temp={nums[i],nums[j],nums[k]};
                         ans.push_back(temp);
                         j++;
                         k--;
                         while(j<k && nums[j]==nums[j-1]) j++;
                         while(j<k && nums[k]==nums[k+1]) k--;
                    }
              }
        }
        return closest;
    }
};