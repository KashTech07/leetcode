class Solution {
    public int minInsertions(String s) {
        int[][] dp = new int[s.length()][s.length()] ;
        for(int[] r : dp){
            Arrays.fill(r , -1) ;
        }
        return solve(s,0,s.length()-1 , dp) ;
    }
    static int solve(String s , int i , int j , int[][] dp){
        if(i>=j) return 0 ;
        if(dp[i][j]!=-1) return dp[i][j] ;
        if(i<s.length()&& j>=0 && s.charAt(i)==s.charAt(j)){
            return dp[i][j]=solve(s , i+1 , j-1 , dp) ;
        }
        int a = 1+solve(s , i+1 , j , dp)  ;
        int b = 1+solve(s , i , j-1 , dp) ;
        return dp[i][j]=Math.min(a,b) ;
    }
}