class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder s1=new StringBuilder();
        int size=s.length();
        for(int i=0;i<size;i++){
            char ch=s.charAt(i);
            if(st.size()==0 || st.peek()!=ch) st.push(ch);
            else if(st.peek()==ch){
                 st.pop();
            }
         }
         while(!st.isEmpty()){
            s1.append(st.pop());
         }
       return s1.reverse().toString();
    }
}