class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        HashSet<Integer> set = new HashSet<>() ;
        for(int n : days) set.add(n) ;
        int[] dp = new int[days[days.length-1]+1] ;
        dp[0] = 0 ;
        for(int i = 1 ; i<=days[days.length-1] ; i++){
            dp[i] = Integer.MAX_VALUE ;
            if(!set.contains(i)) {
                dp[i] = dp[i-1] ;
                continue ;
            }
            int a = costs[0] + dp[Math.max(i-1 , 0)] ;
            int b = costs[1] + dp[Math.max(0,i-7)] ;
            int c = costs[2] + dp[Math.max(0,i-30)] ;
            dp[i] = Math.min(a , Math.min(b,c)) ;
        }
        return dp[days[days.length-1]] ;
    }
}