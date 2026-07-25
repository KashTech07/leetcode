class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> dp = new HashMap<>() ;
        return solve(dp,n) ;
        
    }
    static int solve(HashMap<Integer,Integer> dp , int n){
         if(n==0||n==1) return 1 ;
        if(!dp.containsKey(n)){
            dp.put(n , solve(dp , n-1)+solve(dp , n-2)) ;
        }
        return dp.get(n) ;
    }
}