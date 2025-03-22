import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count the frequency of each word
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Step 2: Use a priority queue to get the top k frequent words
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            public int compare(String word1, String word2) {
                int freq1 = map.get(word1);
                int freq2 = map.get(word2);
                if (freq1 == freq2) {
                    return word1.compareTo(word2); // Lexicographical order for words with the same frequency
                }
                return freq2 - freq1; // Higher frequency comes first
            }
        });

        // Step 3: Add all words to the priority queue
        for (String word : map.keySet()) {
            pq.offer(word);
        }

        // Step 4: Retrieve the top k frequent words
        List<String> result = new ArrayList<>();
        while (k-- > 0 && !pq.isEmpty()) {
            result.add(pq.poll());
        }
        
        return result;
    }
}
