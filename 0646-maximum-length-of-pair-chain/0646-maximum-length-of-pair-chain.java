class Solution {
    public int findLongestChain(int[][] pairs) {
         Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int[][] dp = new int[pairs.length][pairs.length] ;
        int p = -1 ;
        for(int[] r : dp){
            Arrays.fill(r , -1) ;
        }
        return solve(pairs , 0 , p , dp) ;
    }
    static int solve(int[][] arr , int idx , int p , int[][] dp){
        if(idx>=arr.length) return 0 ;
        if(p!=-1&&dp[idx][p]!=-1) return dp[idx][p] ;
        int take = 0 ;
        if(p==-1||arr[p][1]<arr[idx][0]){
            take = 1+solve(arr , idx+1 , idx , dp) ;
        }
        int dont = solve(arr , idx+1 , p , dp) ;
        if(p!=-1) return dp[idx][p]=Math.max(dont , take) ;

        return Math.max(take , dont) ;
    }
}