class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        // for(int i=0,j=t.length()-1;j>=s.leng;i++,j--){
        //     if(s.charAt(i)!=t.charAt(j)) return false;
        // }
        // return true;
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++) arr[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++) arr[t.charAt(i)-'a']--;
        for(int nums: arr){
            if(nums!=0) return false;
        }
        return true;
    }
}