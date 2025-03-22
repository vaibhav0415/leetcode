class Solution {
    public String addStrings(String num1, String num2) {
       int len1=num1.length()-1;
       int len2=num2.length()-1;
       StringBuilder res=new StringBuilder();
     int c=0,base=10;
     while(len1>=0 || len2>=0){
             int s=0;
             int s1=0;
             int s2=0;
             if(len1>=0)
                 s1=num1.charAt(len1--)-'0';
              if(len2>=0)
                  s2=num2.charAt(len2--)-'0';
            s=s1+s2+c;
            if(s>=base){
                c=1;
                s=s-base;
            }
            else{
                c=0;
            }
            res.append(s);
     }   
     if(c==1){
         res.append(c);
     }
     return res.reverse().toString();
    }
}