class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()] ;
        Arrays.fill(dp , -1) ;
        return find(s , wordDict , 0 , dp) ;
    }
    static boolean find(String s  , List<String> wordDict , int idx ,int[] dp){
        if(idx==s.length()) return true ;
        if(dp[idx]!=-1) return dp[idx]==1 ;
        for(int i = 1 ; i<=s.length()-idx ; i++){
           String temp = s.substring(idx , idx+i) ;
           if(wordDict.contains(temp)&&find(s , wordDict , idx+i , dp)){
            return true ;
           }
        }
        dp[idx]= 0  ;
        return false ;
    }
}