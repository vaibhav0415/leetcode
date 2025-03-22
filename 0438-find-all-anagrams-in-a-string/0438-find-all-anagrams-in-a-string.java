
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] p_freq=new int[26];
        int[] w_freq=new int[26];
        
        int lens=s.length();
        int lenp=p.length();
         List<Integer> ls=new ArrayList<>();
        if(lens<lenp) return ls;
        for(int i=0;i<lenp;i++){
            p_freq[p.charAt(i)-'a']++;
            w_freq[s.charAt(i)-'a']++;
        }
       
        if(areArraysEqual(p_freq,w_freq)) ls.add(0);
        for(int i=lenp;i<lens;i++){
            w_freq[s.charAt(i-lenp)-'a']--;
            w_freq[s.charAt(i)-'a']++;
        
        if(areArraysEqual(p_freq,w_freq)) ls.add(i-lenp+1);        
    }
    return ls;
    }
    private boolean areArraysEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}