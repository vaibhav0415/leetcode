class Solution {
    public int[] searchRange(int[] nums, int target) {
            
                 int[] arr={-1,-1};
                 
                 boolean flag=false;
                 int n=nums.length;
                 int start=0;
                 int end=n-1;
                 //first occurence
                 while(start<=end){
                    int mid=start+(end-start)/2;
                    
                     if(nums[mid]==target){
                        if(mid==0){
                        arr[0]=mid;
                        break;
                    }
                     else   if(nums[mid-1]!=target){
                            arr[0]=mid;
                            break;
                        }
                        else{
                            end=mid-1;
                        }

                    }
                    else if (nums[mid]> target) end=mid-1;
                    else start=mid+1;

                 }
                 start=0;
                 end=n-1;
                 //last occurence
                 while(start<=end){
                    int mid=start+(end-start)/2;
                  
                   
                     if(nums[mid]==target){
                         if(mid==n-1){
                        arr[1]=mid;
                        break;
                    }
                      else  if(nums[mid+1]!=target){
                            arr[1]=mid;
                            break;
                        }
                        else{
                            start=mid+1;
                        }

                    }
                    else if (nums[mid]> target) end=mid-1;
                    else start=mid+1;

                 }
                 return arr;

    }
}