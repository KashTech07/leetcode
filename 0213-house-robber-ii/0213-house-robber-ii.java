class Solution {
    public int rob(int[] arr) {
        int n = arr.length ;
        int[] dp = new int[n+1] ;
        if (arr.length == 1) {
        return arr[0] ;
     }
     dp[0] = 0 ;
     for(int i = 1 ; i<=n-1 ; i++){
        int skip = dp[i-1] ;
        int steal = arr[i-1]+((i-2>=0)?dp[i-2]:0) ;
        dp[i] = Math.max(skip , steal) ;
     }
     int result1 = dp[n-1] ;
     Arrays.fill(dp , 0) ;
     for(int i = 2 ; i<=n ; i++){
        int skip = dp[i-1] ;
        int steal = arr[i-1]+((i-2>=0)?dp[i-2]:0) ;
        dp[i] = Math.max(skip , steal) ;
     }
     int result2 = dp[n] ;
     return Math.max(result1 , result2) ;
    }
}