class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        for(int i = 0 ; i<m ; i++){
            if(grid[i][0]==1){
                dfs(grid , i , 0) ;
            }
            if(grid[i][n-1]==1) dfs(grid , i , n-1) ;
        }
        for(int i = 0 ; i<n ; i++){
            if(grid[0][i]==1) dfs(grid , 0 , i) ;
            if(grid[m-1][i]==1) dfs(grid , m-1 , i) ;
        }
        int c = 0 ;
        for(int i = 1 ; i<m ; i++){
            for(int j = 1 ; j<n ; j++){
               if(grid[i][j]==1) c++ ;
            }
        }
        return c ;
    }
    static void dfs(int[][] grid , int r , int c){
        grid[r][c] = 0 ;
        int[] dr = {-1,1,0,0} ;
        int[] dc = {0,0,-1,1} ;
        for(int i = 0 ; i<4 ; i++){
            int nr = r+dr[i] ;
            int nc = c+dc[i] ;
            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                dfs(grid ,nr,nc) ;
            }
        }
    }
}