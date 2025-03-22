class Solution {
    public boolean search(int[] nums, int target) {
        //[1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1]
        //if low==mid==high 
        // we use shrinking process 
        //i.e. low++ high--
        int low=0;
           int high=nums.length-1;
           while(low<=high){
            int mid=low+(high-low)/2;
            
            if(nums[mid]==target) return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]) {
                low++;
                high--;
            }
            else if(nums[mid]<=nums[high]){// see if mid-high sorted
                            if(target>=nums[mid] && target<=nums[high]){
                                low=mid+1;
                            }
                            else{
                                high=mid-1;
                            }
            }
            else{// see if low-high sorted means nums[low]<=nums[mid]
                           if(target>=nums[low] && target<=nums[mid]){
                                high=mid-1;
                            }
                            else{
                                low=mid+1;
                            }
            }
           }
           return false;
    }
}