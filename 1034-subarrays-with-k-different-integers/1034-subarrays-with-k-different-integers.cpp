class Solution {
public:
    int subarraysWithKDistinct(vector<int>& nums, int k) {
           return print(nums,k)-print(nums,k-1);
    }
    int print(vector<int>& nums, int k){
        int l=0,r=0,count=0;
        unordered_map<int,int> map;
        while(r<nums.size()){
            map[nums[r]]++;
            while(map.size()>k){
                map[nums[l]]--;
                if(map[nums[l]]==0) map.erase(nums[l]);
                 l++;
            }
            count+=r-l+1;
           r++;
        }
       return count;
    }
};