class Solution {
    public boolean rotateString(String s, String goal) {
         int m = s.length();
        int n = goal.length();

        if (m != n) {
            return false;
        }

        for (int rotationCount = 1; rotationCount <= m; ++rotationCount) {
           
            s = s.substring(1) + s.charAt(0);
            if (s.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}