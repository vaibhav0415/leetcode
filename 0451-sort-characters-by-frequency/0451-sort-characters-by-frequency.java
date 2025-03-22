class pair {
    char ch;
    int f;

    pair(char ch, int f) {
        this.ch = ch;
        this.f = f;
    }
}
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<pair> pq = new PriorityQueue<>(new Comparator<pair>() {
            public int compare(pair p1, pair p2) {
                return p2.f == p1.f ? p1.ch - p2.ch : p2.f - p1.f;
            }
        });
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            pair p = pq.poll();
            for (int i = 0; i < p.f; i++) {
                result.append(p.ch);
            }
        }

        return result.toString();
    }
}
