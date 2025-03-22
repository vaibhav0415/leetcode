class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (i < j) {
            if (isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            } else {
                if (!isVowel(sb.charAt(i))) {
                    i++;
                }
                if (!isVowel(sb.charAt(j))) {
                    j--;
                }
            }
        }

        return sb.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
