public class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Triplet> pq = new PriorityQueue<>((a, b) -> Double.compare(a.value, b.value));
        for (int i = 0; i < n; i++) {
            pq.offer(new Triplet((double) arr[i] / arr[n - 1], i, n - 1));
        }
        for (int i = 0; i < k - 1; i++) {
            Triplet val = pq.poll();
            if (val.j - 1 > val.i) {
                pq.offer(new Triplet((double) arr[val.i] / arr[val.j - 1], val.i, val.j - 1));
            }
        }
        
        Triplet result = pq.poll();
        return new int[] { arr[result.i], arr[result.j] };
    }

   
    public  class Triplet{
        double value;
        int i, j;

        Triplet(double value, int i, int j) {
            this.value = value;
            this.i = i;
            this.j = j;
        }
    }
}
