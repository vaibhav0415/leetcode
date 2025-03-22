class Solution {
    public int[] twoSum(int[] numbers, int target) {
            int low=0;
            int high=numbers.length-1;
            while(low<high){
                   int i=numbers[low];
                   int j=numbers[high];
                   if(target==i+j) return new int[]{low+1,high+1};
                   else if(target>i+j){
                    low++;
                   }
                   else{//target<i+j
                    high--;
                   }
            }
            return new int[]{0,1};
    }
}