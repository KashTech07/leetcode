class Solution {
    public int closedIsland(int[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length] ;
        for(int i = 0 ; i<grid[0].length ; i++){
            if(grid[0][i]==0 && vis[0][i]==0) dfs(grid , vis , 0 , i) ;
            if(grid[grid.length-1][i]==0 && vis[grid.length-1][i]==0) dfs(grid , vis , grid.length-1 , i) ;
        }
        for(int i = 0 ; i<grid.length ; i++){
            if(grid[i][0]==0 && vis[i][0]==0) dfs(grid , vis , i , 0) ;
            if(grid[i][grid[0].length-1]==0 && vis[i][grid[0].length-1]==0) dfs(grid , vis , i , grid[0].length-1) ;
        }
        int c = 0 ;
        for(int i = 1 ; i<grid.length-1 ; i++){
            for(int j = 1 ; j<grid[0].length-1 ; j++){
                if(grid[i][j]==0 && vis[i][j]==0){
                    c++;
                     dfs(grid , vis , i , j) ;
            }}
        }
        return c ;
    }
    static void dfs(int[][] grid , int[][] vis , int r , int c ){
        vis[r][c]=1 ;
        int[] dr = {0,0,-1 , 1} ;
        int[] dc = {-1 , 1 , 0 ,0} ;
        for(int i = 0 ; i<4 ; i++){
            int nr = r+dr[i] ;
            int nc = c+dc[i] ;
            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==0 && vis[nr][nc]==0){
                dfs(grid , vis , nr , nc) ;
            }
        }
    }
}