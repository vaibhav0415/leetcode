class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        for(int i=0;i<nums.size();i++){
            if(nums[i]%2!=0) nums[i]=1;
            else nums[i]=0; 
        }
        return print(nums,k)-print(nums,k-1);
    }
    int print(vector<int>& nums, int goal){
          int l=0;
         int r=0;
          int count=0;
         int  sum=0;
         while(r<nums.size()){
            sum+=nums[r];
            while(sum > goal ) {
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
         }
         return  count;
    }
};