class Solution {
    public int[] asteroidCollision(int[] arr) {
             Stack<Integer> st=new Stack<>();
             for(int i=0;i<arr.length;i++){
                while(st.size()>0 && arr[i]<0 && st.peek()>0){
                    int sum=arr[i]+st.peek();
                    if(sum<0){
                        st.pop();
                    }
                    else if(sum>0){
                        arr[i]=0;
                        break;
                    }
                    else{
                        arr[i]=0;
                        st.pop();
                        break;
                    }
                }
                if(arr[i]!=0) st.push(arr[i]);
             }
              int[] ans=new int[st.size()];
              for(int i=ans.length-1;i>=0;i--){
                ans[i]=st.pop();
              }
              return ans;
    }
}