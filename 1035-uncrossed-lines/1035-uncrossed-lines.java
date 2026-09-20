class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length] ;
        for(int[] r : dp) {
            Arrays.fill(r , -1) ;
        }
        return solve(nums1 , nums2 , 0 , 0 , dp) ;
    }
    static int solve(int[] a , int[] b , int idx1 , int idx2 , int[][] dp){
        if(idx1>=a.length || idx2>=b.length) return 0 ;
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2] ;
        if(a[idx1]==b[idx2]){
            return dp[idx1][idx2] = 1+solve(a , b , idx1+1 , idx2+1 , dp) ;
        }  
        int a1 = solve(a , b , idx1+1 , idx2 , dp) ;
        int b1 = solve(a , b , idx1 , idx2+1 , dp) ;
        return dp[idx1][idx2] = Math.max(a1 , b1) ;
    } 
}