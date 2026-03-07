class pair{
    int f ; 
    int s ;
    pair(int f , int s)
{
  this.f = f ;
  this.s = s ;
}}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<pair> q1 = new PriorityQueue<>((a,b)-> a.f-b.f );
        for(int i = 0 ;i<profits.length ; i++){
            q1.add(new pair(capital[i],profits[i]));
        }
        PriorityQueue<Integer> q2 = new PriorityQueue<>((a,b)->b-a);
        while(k>0){
            while(!q1.isEmpty()&&q1.peek().f<=w){
                pair p = q1.poll();
                q2.add(p.s);}
                if(q2.isEmpty()) break ;
                w+=q2.poll() ;
                k-- ;}
                return w ;}} 
                