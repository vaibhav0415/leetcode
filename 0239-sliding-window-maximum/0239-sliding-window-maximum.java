class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
              Stack<Integer> st=new Stack<>();
              int n=nums.length;
              int[] ans=new int[n-k+1];
              //length: n-(k-1) length answer ki 
              // 1 2 3 4 5 6 7 8 9 
              // 2 3 4 5 6 7 8 9 -1
              int[] nge=new int[n];
              nge[n-1]=n;
              st.push(n-1);
              for(int i=n-2;i>=0;i--){
                       while(!st.isEmpty() && nums[i]>=nums[st.peek()] ){
                                 st.pop();
                       }
                       if(st.size()==0) nge[i]=n;
                       else nge[i]=st.peek();
                       st.push(i);
              }
              int z=0;
              int j=0;
              for(int i=0;i<n-k+1;i++){
                if(j>=i+k) j=i;
                int max=nums[j];
                while(j<i+k){
                    max=nums[j];
                    j=nge[j];

                }
                ans[z++]=max;
              }
         return ans;
    }
}