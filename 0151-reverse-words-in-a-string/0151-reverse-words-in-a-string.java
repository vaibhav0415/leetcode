class Solution {
    public String reverseWords(String s) {
       
        String[] str=s.split("\\s+");
        StringBuilder string=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
              string.append(str[i]);
              if(i!=0) string.append(" ");
        }
        return string.toString().trim();
    }
}