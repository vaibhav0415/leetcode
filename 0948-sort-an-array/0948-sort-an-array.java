class Solution {
    public int[] sortArray(int[] nums) {
           divide(nums,0,nums.length-1);
           return nums;
    }
    public static void divide(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        conquer(nums,start,mid,end);
    }
      public static void conquer(int[] nums,int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=end){
            if(nums[idx1]<nums[idx2]){
                temp[x++]=nums[idx1++];
            }
            else{
                temp[x++]=nums[idx2++];
            }
             
        }
        while(idx1<=mid){
                temp[x++]=nums[idx1++];
             }
             while(idx2<=end){
                temp[x++]=nums[idx2++];
             }
        for (int i = 0; i < temp.length; i++) 
        nums[start + i] = temp[i];
    
        
        
      }} 
