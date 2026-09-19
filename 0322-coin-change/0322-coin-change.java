class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[amount+1][coins.length+1] ;
        for(int[] r : dp){
            Arrays.fill(r , -1) ;
        }
        int ans = solve(coins , 0 , amount , dp) ;
        return ans>=1000000 ? -1 : ans ;
    }
    static int solve(int[] arr , int idx , int amount , int[][] dp){
        if(idx>=arr.length) return 1000000  ;
        if(amount==0) return 0 ;
        if(dp[amount][idx]!=-1) return dp[amount][idx] ;
        int taken = 1000000;
        int nottaken = solve(arr , idx+1 , amount , dp) ;   
        if(amount>=arr[idx]){
            taken = 1+ solve(arr , idx , amount-arr[idx] , dp) ;
        }
        return dp[amount][idx]=Math.min(taken , nottaken) ;
        
         }
}