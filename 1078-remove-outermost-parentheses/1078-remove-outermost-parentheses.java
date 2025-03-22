class Solution {
    public String removeOuterParentheses(String s) {
              Stack<Character> st=new Stack<>();
              int open=1;
              int close=0;
              int n=s.length();
              for(int i=1;i<n;i++){
                  
                   char ch=s.charAt(i);
                   if(ch=='('){
                        
                         open++;
                   }
                   else{
                   
                    close++;
                   }
                    st.push(ch); 
                   if(open==close){
                     st.pop();
                       i++;
                       close=0;
                       open=1;
                   }
              }
              String res="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }

              return res;













    }
}