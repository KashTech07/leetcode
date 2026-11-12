class Solution {
    public int cherryPickup(int[][] grid) {
        int[][][] dp = new int[71][71][71] ;
        int m = grid.length ;
        int n = grid[0].length ;
        for(int[][] g : dp){
            for(int[] m1 : g) Arrays.fill(m1 , -1) ;
        }
        return solve(grid , 0 , 0 , n-1 , dp) ;
            }

    static int solve(int[][] grid , int r , int c1 , int c2 , int[][][] dp){
        if(r>=grid.length) return 0 ;
        if(dp[r][c1][c2]!=-1) return dp[r][c1][c2] ;
        int sum = grid[r][c1] ;
        if(c1!=c2){
          sum+=grid[r][c2] ;
        }
        int ans = 0;
        for(int i = - 1 ; i <=1 ; i++){
            for(int j = -1 ; j<=1 ; j++){
                 int new_r = r+1 ;
                 int new_c1 = c1+i ;
                 int new_c2 = c2+j ;

                 if(new_c1 >= 0 && new_c1<grid[0].length && new_c2>=0 && new_c2<grid[0].length){
                    ans = Math.max(ans ,solve(grid , new_r , new_c1 , new_c2 , dp)) ;
                 }
            }}
            return dp[r][c1][c2]=sum+ans ;       
    }
}