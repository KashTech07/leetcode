class Solution {
    public int maxProfit(int[] prices) {
        int k = 2 ;
        int n = prices.length ;
        int[][] dp = new int[n][3] ;
        for(int[] a : dp) Arrays.fill(a , -1) ;
        int ans = solve(prices , k , 0 , n , dp) ;
        return ans ;
    }
    static int solve(int[] prices , int k , int i , int n , int[][] dp){
        if(i==n) return 0 ;
        if(k==0) return 0 ;
        if(dp[i][k]!=-1) return dp[i][k] ;
        if(k==2){
            int a = solve(prices , k-1 , i+1 , n,dp) - prices[i] ;
            int b = solve(prices , k , i+1 , n,dp) ;
            return dp[i][k]=Math.max(a,b) ;
        }
        else{
            int a = solve(prices , k-1 , i+1 ,n ,dp) + prices[i] ;
            int b = solve(prices , k , i+1 , n ,dp) ;
            return dp[i][k]=Math.max(a,b) ;
        }
    }
}