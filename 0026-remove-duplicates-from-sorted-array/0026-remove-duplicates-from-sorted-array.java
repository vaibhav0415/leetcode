class Solution {
    public int removeDuplicates(int[] nums) {
           int n=nums.length;;
           int i=0;
           int j=1;
           int idx=0;
           while(i<n && j<n){
             if(nums[i]!=nums[j]){
                idx++;
                nums[i+1]=nums[j];
                i++;
                j++;
             }
             else{
                 j++;
             }
           }
           return idx+1;
    }
}