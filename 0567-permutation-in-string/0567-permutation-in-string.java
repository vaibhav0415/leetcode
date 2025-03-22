class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr=new int[26];
          int k=s1.length();
        for(int i=0;i<k;i++){
           arr[s1.charAt(i)-'a']++;
        }
       int lo=0;
       int hi=0;
     
       int req=k;
       while (hi < s2.length()) {
            if (arr[s2.charAt(hi) - 'a'] > 0) req--;
            arr[s2.charAt(hi) - 'a']--;
            hi++;

            if (req == 0) return true;

            if (hi - lo == k) {
                if (arr[s2.charAt(lo) - 'a'] >= 0) req++;
                arr[s2.charAt(lo) - 'a']++;
                lo++;
            }
        }
       return false;
     }
}