class Solution {
    int fact(int n){
        int f=1;
        for(int i=2;i<=n;i++){
               f*=i;
        }
        return f;
    }
    int rev(int n){
            int r=0;
            while(n>0){
                r*=10;
                r+=(n%10);
                n/=10;
            }
            return r;
          }
          public int combi(int n,int r){
            return fact(n)/(fact(r)*fact(n-r));
          }
    public int countNicePairs(int[] nums) {
          int n=nums.length;
          int count=0;
          Map<Integer,Integer> map=new HashMap<>();
          for(int i=0;i<n;i++){
            nums[i]=nums[i]-rev(nums[i]);
          }
           for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                count=count%1000000007;
                count+=map.get(nums[i]);
                 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          }
         
          return count%1000000007;

    }
}