class Solution {
    public int islandPerimeter(int[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length] ;
        int ans = 0 ;
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    ans+=dfs(grid , vis , i , j);
                }
            }
        }
        return ans; 
    } 
    static int dfs(int[][] grid , int[][] vis  , int r , int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length){
            return 1 ;
        }
        if(grid[r][c]==0) return 1 ;
        if(vis[r][c]==1) return 0 ;
        vis[r][c] = 1 ;
return dfs(grid , vis , r-1 , c)+dfs(grid , vis, r+1 , c)+dfs(grid , vis , r , c-1)+dfs(grid , vis , r ,c+1) ;
    }
}