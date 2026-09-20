class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        int[][] dp = new int[s1.length()+1][s2.length()+1] ;
        for(int[] r : dp) Arrays.fill(r , -1) ;
        return solve(s1 , s2 ,0 , 0 , s3 ,dp ) ;
    }
    static boolean solve(String s1, String s2, int idx1 , int idx2 , String s3  , int[][] dp){
        if(idx1==s1.length()&&idx2==s2.length()) return true ;
       // if(idx1==s1.length() || idx2==s2.length()) return false ;
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2]==1 ;
        int idx3 = idx1+idx2 ;
        boolean ans = false ;
        if(idx1<s1.length()&&s1.charAt(idx1)==s3.charAt(idx3)){
            ans = solve(s1 , s2 , idx1+1 , idx2 , s3 ,dp) ;
        }
        if(!ans&& idx2<s2.length() && s2.charAt(idx2)==s3.charAt(idx3) ){
            ans = solve(s1,s2,idx1 , idx2+1 , s3 , dp) ;
        }
        dp[idx1][idx2]= ans? 1 : 0 ;
        return ans ; }}