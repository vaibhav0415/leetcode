class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ar=new ArrayList<>();
           int count1=0;
           int count2=0;
           int element1=0;
           int element2=0;
           int n=nums.length;
           for(int i=0;i<n;i++){
               if(count1==0 && element2!=nums[i]){
                   count1=1;
                   element1=nums[i];
               }
               else if(count2==0 &&   element1!=nums[i]){
                   count2=1;
                   element2=nums[i];
               }
               else if(nums[i]==element1){
                       count1++;
               }
               else if(nums[i]==element2){
                       count2++;
               }
               else{
                   count1--;
                   count2--;
               }

           }
            count1=0;
             count2=0;

           for(int i=0;i<n;i++){
               if(nums[i]==element1){
                   count1++;
               }
               if(nums[i]==element2){
                   count2++;
               }

              
           }
            if(count1>n/3)  ar.add(element1);
               if(count2>n/3 && element1!=element2)  ar.add(element2);
           return ar;
          
 }
    }
