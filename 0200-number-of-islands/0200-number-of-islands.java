class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        int[][] vis = new int[m][n] ;
        int c = 0 ;
        for(int i = 0 ; i <m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    c++ ;
                    dfs(grid , vis , i , j) ;
                }
            }
        }
        return c ;
    }
    static void dfs(char[][] grid , int[][] vis , int r , int c){
        int[] dr = {-1,1,0,0} ;
        int[] dc = {0,0,-1,1} ;
        vis[r][c] = 1 ;
        for(int i = 0 ; i <4 ; i++){
            int nr = r+dr[i] ;
            int nc = c+dc[i] ;
            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && vis[nr][nc]==0 && grid[nr][nc]=='1'){
                dfs(grid , vis , nr ,nc) ;
            }
        }
    }
}