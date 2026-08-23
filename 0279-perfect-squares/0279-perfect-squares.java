class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1] ;
        Arrays.fill(dp , -1) ;
        return solve(n , dp) ;
    }
    static int solve(int n , int[] dp){
        if(n==0) return 0 ;
        if(dp[n]!=-1) return dp[n] ;
        int ans = Integer.MAX_VALUE ;
        for(int i = 1 ; i*i<=n ; i++){
          int res = 1+solve(n-i*i , dp) ;
          ans = Math.min(ans , res) ;
        }
        return dp[n]=ans ;
    }
}