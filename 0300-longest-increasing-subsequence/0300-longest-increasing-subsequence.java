class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1] ;
        int p = -1 ;
        for(int[] r : dp){
            Arrays.fill(r,-1) ;
        }
        return solve(0,p,dp,nums) ;
    }
    static int solve(int idx , int p , int[][] dp , int[] arr){
        if(idx>=arr.length) return 0;
        if(p!=-1&&dp[idx][p]!=-1) return dp[idx][p] ;
        int take = 0;
        if(p==-1||arr[p]<arr[idx]){
           take = 1+solve(idx+1,idx,dp,arr) ;
        }
        int dont = solve(idx+1,p,dp,arr) ;
        if(p!=-1)
        dp[idx][p]=Math.max(take,dont) ;

        return Math.max(take,dont) ;
    }
}