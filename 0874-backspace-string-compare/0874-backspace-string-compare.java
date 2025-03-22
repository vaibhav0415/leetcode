class Solution {
    public boolean backspaceCompare(String s, String t) {
         Stack<Character> st=new Stack<>();
         Stack<Character> tt=new Stack<>();
         int n=s.length();
         int m=t.length();
         
         for(int i=0;i<n;i++){
                if(s.charAt(i)=='#' && st.size()>0) st.pop();
                else if(s.charAt(i)!='#') st.push(s.charAt(i));
                
            
         }
        
         for(int i=0;i<m;i++){
                 if(t.charAt(i)=='#' && tt.size()>0) tt.pop();
                 else if(t.charAt(i)!='#') tt.push(t.charAt(i));
                
            
         }
         StringBuilder temp1=new StringBuilder();
         while(st.size()>0){
             temp1.append(st.pop());
         }
          StringBuilder temp2=new StringBuilder();
         while(tt.size()>0){
             temp2.append(tt.pop());
         }
        String temp11=temp1.toString();
        String temp22=temp2.toString();
         return temp11.equals(temp22);
         
    }
}