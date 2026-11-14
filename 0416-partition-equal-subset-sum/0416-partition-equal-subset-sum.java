class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0 ;
        for(int n : nums){
            sum+=n;
        }
        if(sum%2!=0) return false ;
        int req = sum/2 ;
        boolean[] dp = new boolean[req+1] ;
        dp[0] = true ;
        for(int i = 0 ; i <nums.length ; i++){
            for(int j = req ; j>=nums[i] ; j--){
                dp[j] = dp[j] || dp[j-nums[i]] ;
            }
        }
        return dp[req] ; }}
         