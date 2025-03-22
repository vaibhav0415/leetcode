class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
         while(i<nums.length){
            int correct=nums[i]-1;
            if( nums[i]!=nums[correct]) swap(nums,i,correct);
            else i++;
         }
        List<Integer> lst=new ArrayList<>();
         for( i=0;i<nums.length;i++){
            if(nums[i]-1!=i)  lst.add(i+1);
         }
        return lst;

    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
;    }   
   
}