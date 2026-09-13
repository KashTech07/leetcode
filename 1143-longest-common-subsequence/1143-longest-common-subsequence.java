class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()] ;
        for(int[] r : dp){
            Arrays.fill(r , -1) ;
        }
        return solve(text1 , text2 , 0 ,0 , dp) ;
    }
    static int solve(String s1 , String s2 , int idx1 , int idx2 , int[][] dp){
        if(idx1==s1.length() || idx2==s2.length()) return 0 ;
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2] ;
        if(s1.charAt(idx1)==s2.charAt(idx2)) {
            return dp[idx1][idx2]=1+solve(s1,s2,idx1+1 ,idx2+1 ,dp) ;
        }
        int a = solve(s1,s2,idx1+1 , idx2 ,dp) ;
        int b = solve(s1,s2,idx1 , idx2+1 , dp) ;
        return dp[idx1][idx2] = Math.max(a,b) ;
    }
}