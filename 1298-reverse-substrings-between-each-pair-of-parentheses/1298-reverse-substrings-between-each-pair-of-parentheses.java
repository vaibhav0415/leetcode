class Solution {
    public String reverseParentheses(String s) {
         Stack<StringBuilder> st=new Stack<>();
         StringBuilder ans=new StringBuilder();
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                 st.push(ans);
                 ans=new StringBuilder();
            }
            else if(s.charAt(i)==')'){
               ans.reverse();
                if(st.size()>0){
                    StringBuilder temp = st.pop();
                    temp.append(ans);
                    ans = temp;
                }     
            }
            else{
                ans.append(s.charAt(i));
            }
         }
         return ans.toString();
    }
}