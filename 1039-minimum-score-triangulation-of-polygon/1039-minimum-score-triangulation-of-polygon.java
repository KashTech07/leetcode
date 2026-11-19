class Solution {
    public int minScoreTriangulation(int[] values) {
        int l = 0 ; 
        int r = values.length-1 ;
        int[][] dp = new int[values.length][values.length] ;
        for(int[] a : dp) Arrays.fill(a , -1) ;
        return solve(values , l , r , dp) ;
    }
    static int solve(int[] values , int l , int r , int[][] dp){
        if(r-l<2) return 0 ;
        if(dp[l][r]!=-1) return dp[l][r] ;
        int min = Integer.MAX_VALUE ;
        for(int i = l+1 ; i<r ; i++){
            int res = values[l]*values[i]*values[r] + solve(values ,l, i , dp) + solve(values , i , r ,dp) ;
            min = Math.min(min , res) ;
        }
        return dp[l][r] = min ;
    }
}