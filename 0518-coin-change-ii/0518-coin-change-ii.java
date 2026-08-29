class Solution {
    public int change(int amount, int[] coins) {
    //     int[][] dp = new int[amount+1][coins.length] ;
    //     for(int[] r : dp)
    //     Arrays.fill(r , -1) ;
    //     return solve(coins , amount , 0 , dp) ;
    // }
    // static int solve(int[] arr , int amount , int idx , int[][] dp){
    //     if(amount==0) return 1 ;
    //     if(idx==arr.length) return 0 ;
    //    // if(amount<arr[idx]) return 0 ;
    //     if(dp[amount][idx]!=-1) return dp[amount][idx] ;
    //     int take = 0;
    //     if(arr[idx]<=amount)
    //      take =  solve(arr , amount-arr[idx] , idx , dp) ;
    //     int notake = solve(arr , amount ,idx+1 , dp) ;
    //     return dp[amount][idx]=take+notake ;
    // }
int[][] dp = new int[amount+1][coins.length+1] ;
for(int[] r : dp){
    Arrays.fill(r , -1) ;
}
return solve(coins , 0 , amount , dp) ;}
static int solve(int[] arr , int idx , int amount , int[][] dp){
    if(amount==0) return 1 ; 
    if(idx==arr.length) return  0 ;
    if(dp[amount][idx]!=-1) return dp[amount][idx] ;
    int taken = 0 ;
    int nottaken = solve(arr , idx+1 , amount , dp) ;
    if(amount>=arr[idx]){
        taken = solve(arr , idx , amount-arr[idx] , dp) ;
    }
    return dp[amount][idx] = taken+nottaken ;
}}