class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Calculate remainder frequencies
        for (int ele : arr) {
            int remainder = ((ele % k) + k) % k; // Handle negative numbers
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        
        // Step 2: Check for valid pairs
        for (int ele : map.keySet()) {
            int remainder = ele;
            
            if (remainder == 0) { // Special case for remainder 0
                if (map.get(remainder) % 2 != 0) return false; // Must be even
            } else {
                int complement = k - remainder;
                if (!map.containsKey(complement) || !map.get(remainder).equals(map.get(complement))) {
                    return false; // No matching complement remainder or unequal frequencies
                }
            }
        }
        
        return true; // All pairs matched
    }
}
