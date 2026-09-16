class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0 ;
        for(int n : nums){
            sum+=n;
        }
        if(sum%2!=0) return false ;
        int req = sum/2 ;
        int p = 0 ;
         int[][] dp = new int[nums.length][req+1] ;
         for(int[] r : dp)
         { Arrays.fill(r , -1) ;}
        return solve(nums , req , 0 , p , dp) ;
    }
    static boolean solve(int[] nums , int req , int idx , int p , int[][] dp){
          if(p==req) return true ;
        if(idx>=nums.length) return false ;
        if(dp[idx][p]!=-1) return dp[idx][p]==1 ;
        boolean take = false ;
        if(p==-1 || nums[idx]+p<=req){
            take = solve(nums , req , idx+1 , nums[idx]+p , dp ) ;
        }
        boolean dont = solve(nums , req , idx+1 , p , dp) ;
        dp[idx][p]=(take||dont)?1:0;
        return take || dont ;
    }
}