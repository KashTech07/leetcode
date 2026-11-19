class Solution {
    public int minCost(int n, int[] cuts) {
        int n1 = cuts.length ;
        int[] arr = new int[n1+2] ;
        int[][] dp = new int[n1+2][n1+2] ;
        for(int i = 1 ; i<=n1 ; i++){
            arr[i] = cuts[i-1] ;
        }
        arr[0] = 0 ;
        arr[n1+1] = n ;
        Arrays.sort(arr) ;
        for(int[] a : dp) Arrays.fill(a,-1) ;
        int ans = solve(arr , 0 , n1+1 , dp) ;
        return ans ;
    }
    static int solve(int[] arr , int l , int r ,int[][] dp ){
        if(r-l<2) return 0 ;
        if(dp[l][r]!=-1) return dp[l][r] ;
        int min = Integer.MAX_VALUE ;
        for(int i = l+1 ; i<=r-1 ; i++){
            int res = (arr[r]-arr[l]) + solve(arr , l , i , dp) + solve(arr , i , r , dp) ;
             min = Math.min(res , min) ;
        }
        return dp[l][r] = min ;
    }
}