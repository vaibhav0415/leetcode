class Solution {
    public int calPoints(String[] ops) {
          Stack<Integer> st=new Stack<>();
           for(int i=0;i<ops.length;i++){
               if(ops[i].equals("C")){
                st.pop();
               }
               else if(ops[i].equals("+")){
                int last = st.pop();
                int secondLast = st.peek();
                st.push(last);
                st.push(last + secondLast);
           } 
           else if(ops[i].equals("D")){
             st.push(2*st.peek());
           }
           else{
            st.push(Integer.parseInt(ops[i]));
           }
    }
    int sum=0;
    while(!st.isEmpty()){
        sum+=st.pop();
    }
    return sum;
}}