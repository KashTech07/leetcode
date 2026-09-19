class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1] ;
        Arrays.fill(dp , -1) ;
        return Math.min(solve(cost , 0 , dp) , solve(cost , 1 , dp)) ;
    }
    static int solve(int[] cost , int idx , int[] dp ){
        if(idx==cost.length || idx==cost.length-1 || idx==cost.length-2) return cost[idx] ;
        if(dp[idx]!=-1) return dp[idx] ;
        int a = cost[idx]+solve(cost , idx+1 , dp) ;
        int b = cost[idx]+solve(cost , idx+2 , dp) ;
        return dp[idx] = Math.min(a,b) ;
    }
}