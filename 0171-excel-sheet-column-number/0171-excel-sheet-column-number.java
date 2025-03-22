class Solution {
    public int titleToNumber(String columnTitle) {
          int size=columnTitle.length()-1;
          int sum=0;
          for(int i=0;i<=size;i++){
            sum += (columnTitle.charAt(i) - 64) * Math.pow(26, size - i);  
          } 
          return sum;
    }
}