class Solution {
    public List<String> letterCasePermutation(String s) {
                 List<String> ls=new ArrayList<>();
                 print(s,"",ls);  
                 return ls; 
    }
    public static void print(String s , String ans,List<String> ls ){
        if(s.length()==0){
            ls.add(ans);
            return;
        }
             char ch=s.charAt(0);
            if(Character.isLetter(ch)){
                print(s.substring(1),ans+Character.toLowerCase(s.charAt(0)),ls);
                print(s.substring(1),ans+Character.toUpperCase(s.charAt(0)),ls);
            }
           
            else{
                 print(s.substring(1),ans+s.charAt(0),ls);
            }
        
    }
}