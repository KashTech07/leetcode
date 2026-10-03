class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length] ;
        int ans = 0 ;
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    ans = Math.max(ans , dfs(grid , vis , i , j)) ;
                }
            }
        }
        return ans ;
    }
    static int dfs(int[][] grid , int[][] vis , int r , int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || vis[r][c]==1 || grid[r][c]==0){
            return 0 ;
        }
        vis[r][c] = 1 ;
        return 1+dfs(grid , vis , r-1 , c)+dfs(grid , vis , r+1 , c)+dfs(grid ,vis , r , c-1)+dfs(grid , vis , r , c+1) ;
    }
}