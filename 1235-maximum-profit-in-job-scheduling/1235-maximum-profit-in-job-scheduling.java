class pair {
    int a ; 
    int b ; 
    int c ;
    pair(int a ,int b , int c){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }
}
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[][] p = new int[startTime.length][3] ;
        int[] dp = new int[startTime.length] ;
        Arrays.fill(dp , -1) ;
        for(int i = 0 ; i<startTime.length ; i++){
            p[i][0] = startTime[i] ;
            p[i][1] = endTime[i] ;
            p[i][2] = profit[i] ;
        }
        Arrays.sort(p , (a,b)-> a[0]-b[0]) ;
        return solve(p,0,dp) ;
    }
    static int solve(int[][] pair , int idx , int[] dp){
        if(idx==pair.length) return 0 ;
        if(dp[idx]!=-1) return dp[idx] ;
            int num = next(pair , idx) ;
            int taken = pair[idx][2] + solve(pair , num , dp) ;
            int nottaken = solve(pair , idx+1 , dp) ;
            return dp[idx]=Math.max(taken , nottaken) ;
    }
    static int next(int[][] pair , int idx){
        for(int i = idx+1 ; i<pair.length ; i++){
            if(pair[i][0]>=pair[idx][1]){
                return i ;
            }
        }
        return pair.length ;
    }
}