class Solution {
    public boolean check(int speed,int[] piles,int h){
        int count=0;
        
        for(int i=0;i<piles.length;i++){
            if(count>h) return false;
                    if(speed>=piles[i]) count++;
                    else if(piles[i]%speed==0) count+=(piles[i]/speed);
                    else count+=(piles[i]/speed+1);
        }
         if(count>h) return false;
         else return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=-1;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]) max=piles[i];
        }
        int start=1;
        int end=max;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(check(mid,piles,h)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}