class Solution {
    public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
            for(int stone:stones){
                    pq.add(stone);
            }
           while(pq.size()>1){
             int curr=pq.poll();
             int next=pq.poll();
             int arr=Math.abs(curr-next);
             pq.add(arr);
           }
           return pq.peek();
    }
}