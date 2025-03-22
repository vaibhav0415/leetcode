class Solution {
    public boolean isHappy(int n) {
       

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=9;i++){
            map.put(i,i*i);
        }
        
       
        while(n>9){
            int m=n;
            int square=0;
            while(m!=0){
                square+=map.get(m%10);
                m=m/10;
            }
            m=square;
            n=m;
        }
        return (n==1 || n==7)?true:false;
    }
    
}