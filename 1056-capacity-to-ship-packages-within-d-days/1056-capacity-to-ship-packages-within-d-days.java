class Solution {
    public boolean check(int mid,int[] weights,int days){
        //  [3,2,2,4,1,4] days=3
        int m=mid;
        
        int count=1;
        for(int i=0;i<weights.length;i++){
            if(m>=weights[i]){
                m-=weights[i];
            }
            else{
                count++;
                m=mid;
                 m-=weights[i];
            }
        }
        if(count>days) return false;
        else return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=-1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(max<weights[i]) max=weights[i];
            sum=sum+weights[i];
        }
        int lo=max;
        int high=sum;
        int mincapacity=sum;
        while(lo<=high){
            int mid=lo+(high-lo)/2;
            if(check(mid,weights,days)){
                mincapacity=mid;
                high=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return mincapacity;
    }
}