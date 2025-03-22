class Solution {
    public void rotate(int[] nums, int k) {
       // step 1 reverse whole array
       // step 2 reverse 0 to k-1;
       // step 3 reverse k to n
       
       int n =nums.length-1;
       k=k%(n+1);
       reverse(nums,0,n);
       reverse(nums,0,k-1);
       reverse(nums,k,n);

    }
    public static void reverse(int[] nums,int i,int j){
        while(i<=j){
           int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}