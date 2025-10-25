class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      int answer=0;
      int extraadd=0;
      int temp=numBottles;
      while(numBottles>=numExchange){
        int r=numBottles%numExchange;
        int extra=numBottles/numExchange;
        extraadd+=extra;
        numBottles=r+extra;
      }
      answer=extraadd+temp;
      return answer;}}