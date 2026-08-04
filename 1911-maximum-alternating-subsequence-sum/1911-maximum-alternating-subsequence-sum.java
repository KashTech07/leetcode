class Solution {
    public long maxAlternatingSum(int[] nums) {
        Long[][] dp = new Long[nums.length][2] ;
       boolean flag =true ;
        return solve(0 , flag , nums ,dp) ;
    }
    static long solve(int idx , boolean flag , int[] nums , Long[][] dp){
        if(idx==nums.length) return 0 ;
        int f=flag?0:1 ;
        if(dp[idx][f]!=null) return dp[idx][f] ;
       long nottake = solve(idx+1 , flag , nums ,dp) ;
       long val = nums[idx] ;
        if(flag!=true){
            val = -val ;
        }
       long take = solve(idx+1 ,!flag , nums ,dp) + val;
        return dp[idx][f] = Math.max(take , nottake) ;
    }
}