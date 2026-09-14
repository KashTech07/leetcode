class Solution {
    static int ans = 0 ;
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()] ;
        for(int[] r : dp) Arrays.fill(r , -1) ;
        return solve(s1 , s2 , 0 , 0 , dp) ;
    }
    static int solve(String s1 , String s2 , int i , int j , int[][] dp){
        if(i==s1.length()) return ascii(s2.substring(j)) ;
        if(j==s2.length()) return ascii(s1.substring(i)) ;
        if(dp[i][j]!=-1) return dp[i][j] ;
        //if(i==s1.length()&&j==s2.length()) return 0 ;
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j] = solve(s1,s2,i+1,j+1 , dp) ;
        int a = ascii(String.valueOf(s1.charAt(i)))+solve(s1,s2,i+1 , j ,dp) ;
        int b = ascii(String.valueOf(s2.charAt(j)))+solve(s1,s2,i,j+1 ,dp) ;
        return dp[i][j]=Math.min(a,b) ;
    }
    static int ascii(String s){
        int ans = 0 ;
        for(char c : s.toCharArray()){
            ans += c ;
        }
        return ans ;
    }
}