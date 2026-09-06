class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a) ;
        int sum = 0 ;
        for(int i = 0 ; i<piles.length ; i++){
            q.add(piles[i]) ;
            sum+=piles[i] ;
        }
        for(int i = 0 ; i<k ; i++){
            int max_element = q.poll() ;
            int remove = max_element/2 ;
            sum-=remove ;
            max_element-=remove ;
            q.add(max_element) ;

        }
        return sum ; 
    } 
}