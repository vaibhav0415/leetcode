class Solution {
    public String countAndSay(int n) {
         //1
         //11(count of the digit + value of the digit)
         //21
         //1211
         //111221
         //312211
         //13112221
          if(n==1) return "1";
          if(n==2) return "11";
          String s="11";
          for(int i=3;i<=n;i++){
              s+='&';
              String t="";
              int c=1;
              for(int j=1;j<s.length();j++){
                 if(s.charAt(j)!=s.charAt(j-1)) {
                      t+=String.valueOf(c);
                      t+=s.charAt(j-1);
                      c=1;
                 }
                 else{
                    c++;
                 }
              }
              s=t;
          }
          return s;
          //good ques
    }
}