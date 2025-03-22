class MedianFinder {
    PriorityQueue<Integer> right = new PriorityQueue<>();//minheap
     PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());//maxheap
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
         if(left.size()==0 || left.peek()>num){
             left.add(num);
         }else{
            right.add(num);
         }
         if(left.size()>right.size()+1){
            
            right.add(left.poll());
         }
         if(left.size()+1<right.size()){
            
            left.add(right.poll());
         }
    }
    
    public double findMedian() {
          if(left.size()==right.size()) return (left.peek()+right.peek())/2.0;
          else  if(left.size()>right.size()) return left.peek();
          else return right.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */