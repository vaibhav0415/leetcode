class Solution {
    public String convertToTitle(int num) {
         StringBuilder s=new StringBuilder();
         while(num>0){
            num--;
            int a=num%26;
            num/=26;
            s.append((char)(a+'A'));
         }
         return s.reverse().toString();
    }
}