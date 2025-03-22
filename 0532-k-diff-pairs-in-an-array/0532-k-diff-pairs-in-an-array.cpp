class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int i=0;
        int j=1;
        int c=0;
        sort(nums.begin(),nums.end());
        while(i<nums.size() && j<nums.size()){
            if(nums[j]-nums[i]==k){
                i++;
                j++;
                c++;
                while(j<nums.size() && nums[j]==nums[j-1])j++;
            } 
            else if(nums[j]-nums[i]>k) {
                i++;
                if(i==j)j++;
                }
            else j++; 
        }
        return c;
    }
};