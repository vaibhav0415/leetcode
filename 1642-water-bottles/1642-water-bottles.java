class Solution {
    
    public int numWaterBottles(int numBottles, int numExchange) {
          int s=numBottles;
          int filled=numBottles;
          while(numBottles>=numExchange){
             filled=numBottles/numExchange;
               s+=filled;
              
               numBottles=filled + numBottles%numExchange;
              
          }
          return s;
    }
}