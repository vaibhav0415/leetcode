class Solution {
    public int addDigits(int num) {
                while(num>9){
            int x=num;
            int sum=0;
            while(x!=0){
                int r=x%10;
                sum=sum+r;
                x=x/10;
            }
            num=sum;
        }
        return num;
    }
}