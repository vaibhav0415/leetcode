class Solution {
    static String arr[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
       List<String> list=new ArrayList<>();
       if(digits.length()==0) return list;
       print(digits,list,"");
       return list;

        
    }
    public static void  print(String s,List<String> list,String ans){
        if(s.length()==0){
            list.add(ans);
            return;
        }
        char ch=s.charAt(0);
        String ques=arr[ch-'0'-1];
        for(int i=0;i<ques.length();i++){
        print(s.substring(1),list,ans+ques.charAt(i));
        }
    }
}