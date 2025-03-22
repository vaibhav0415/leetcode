class Solution {
    public boolean isValid(String s) {
         Stack<Character> st=new Stack<>();
        int n=s.length();
        for (int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch=='{' || ch=='[') {
                st.push(ch);
            } else if(ch==')') {// ch==')'
                if (st.size() == 0 || st.peek()!='(') return false; //imp cond
                else st.pop();
            }
            else if(ch=='}'){
                if (st.size() == 0 || st.peek()!='{' ) return false;
                // if( st.peek()=='{') st.pop();
                 else st.pop();
            }
             else if(ch==']'){
                if (st.size() == 0 || st.peek()!='[') return false;
                else st.pop();
            }
        }
            if(st.size()>0) return false;
            else  return  true;
        
    }
}