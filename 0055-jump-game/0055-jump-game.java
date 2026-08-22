class Solution {
    public boolean canJump(int[] nums) {
int[] dp = new int[nums.length+1] ;
for(int i = 0 ; i<dp.length ; i++) dp[i] = -1 ;
 return canBe(nums,0 , dp) ; }
 static boolean canBe(int[] arr , int idx , int[] dp){
     if(idx==arr.length-1) return true ;
     if(dp[idx]!=-1) return dp[idx]==1 ;
     for(int i = 1 ; i<=arr[idx] ; i++){
        if(i+idx<arr.length){
        if(canBe(arr, i+idx ,dp)) return true ;
     }}
     dp[idx] = 0 ;
     return false ;
 }}