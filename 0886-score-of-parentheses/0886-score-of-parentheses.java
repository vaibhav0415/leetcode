class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int score=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(score);
                score=0;
            }
            else{
                score=st.peek()+Math.max(1,2*score);
                st.pop();
            }
        }
        return score;
    }
}