import java.util.*;

class Pair {
    int cap;
    int prof;

    Pair(int cap, int prof) {
        this.cap = cap;
        this.prof = prof;
    }
}

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.prof - a.prof);
        
       
        List<Pair> ls = new ArrayList<>();
        for (int i = 0; i < profits.length; i++) {
            ls.add(new Pair(capital[i], profits[i]));
        }
        ls.sort(Comparator.comparingInt(a -> a.cap)); // Sort by capital

        int index = 0;

       
        while (k > 0) {
          
            while (index < ls.size() && ls.get(index).cap <= w) {
                pq.add(ls.get(index));
                index++;
            }
            
           
            if (pq.isEmpty()) {
                break;
            }
            
          
            w += pq.poll().prof; 
            k--; 
        }
        
        return w;
    }
}
