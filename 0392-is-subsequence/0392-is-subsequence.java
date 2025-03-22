class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
          int i=0;
          int j=0;
          int len=t.length();
          int len2=s.length();
         
          while(j<len && i<len2){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                
            }
            else{
                j++;
                
            }}
            if(i==s.length()) return true;
            else return false;
          }
    
}