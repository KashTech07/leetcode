class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size() ;
        int[][] dp = new int[n][n] ;
        //int[][] grid = new int[n][n] ;
        // for(int i = 0 ; i<n ; i++){
        //     for(int j = 0 ; j<triangle.get(i).size() ; j++){
        //         grid[i][j] = triangle.get(i).get(j) ;
        //     }
        // }
//         for(int i = 0 ; i<n ;i++){
//             dp[n-1][i] = grid[n-1][i] ;
//         }
//         for(int i = n-2 ; i>=0 ; i--){
//             for(int j = 0 ; j<n-1 ; j++){
//                 dp[i][j] = grid[i][j]+ Math.min(dp[i+1][j] , dp[i+1][j+1]) ;
//             }
//         }
//         return dp[0][0] ;
//     }
// }
for(int i = 0 ; i<n ; i++){
    dp[n-1][i] = triangle.get(n-1).get(i) ;
}
for(int i = n-2 ; i>=0 ; i--){
    for(int j = 0 ; j<triangle.get(i).size() ; j++){
        dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j] , dp[i+1][j+1]) ;
    }
}
return dp[0][0] ;}}