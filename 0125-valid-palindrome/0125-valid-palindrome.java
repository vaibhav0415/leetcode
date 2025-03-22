class Solution {
    public boolean isPalindrome(String s) {
         
            String ans="";
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             if(ch>=97 && ch<=122 || ch>=48 && ch<=57) ans+=ch;
             else if(ch>=65 && ch<=90) ans+=(char)(ch+32);
             else continue;
         }
          int i=0;
          int j=ans.length()-1;
          while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)) return false;
            i++;
            j--;
          }
          return true;
    }
}