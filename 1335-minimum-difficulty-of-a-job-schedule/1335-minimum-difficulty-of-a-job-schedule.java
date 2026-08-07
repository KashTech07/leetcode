class Solution {
    
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length ;
        if(d>n) return -1 ;
        int[][] dp = new int[n+1][d+1];
        for(int[] r : dp)
        Arrays.fill(r,-1) ;
        return solve(0,jobDifficulty , d , n,dp) ;
 
    }

    static int solve(int idx , int[] arr , int d , int n,int[][] dp ){
        if(dp[idx][d]!=-1) return dp[idx][d] ;
        if(d==0) return 0 ;
        if (d == 1) {
    int max = 0;
    for(int i = idx; i < n; i++)
        max = Math.max(max, arr[i]);
    return max;
}
        int maxd = arr[idx] ;
        int finaln = Integer.MAX_VALUE ;
        for(int i = idx ; i<=n-d ; i++){
            maxd = Math.max(maxd , arr[i]) ;
            int result = maxd + solve(i+1 , arr , d-1 , n ,dp) ;
            finaln = Math.min(finaln , result) ;
        }
        return dp[idx][d]=finaln ;
    }
}