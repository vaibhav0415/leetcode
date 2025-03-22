
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int minlen=n+1;
        int len;
        int sum=0;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                 len=j-i+1;
                minlen=Math.min(minlen,len);
            
                sum-=nums[i];
                 i++;

            }
            j++;
        }
        if(minlen==n+1) return 0;
        return minlen;

    }
}