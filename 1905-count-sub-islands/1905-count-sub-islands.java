class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int[][] vis = new int[grid1.length][grid1[0].length] ;
        int c= 0 ; 
        for(int i = 0 ; i<grid2.length ; i++){
            for(int j = 0 ; j<grid2[0].length ; j++){
                if(grid2[i][j]==1 && vis[i][j]==0){
                    if(dfs(grid1 , grid2 , i , j , vis)) c++ ;
                }
            }
        }
        return c ;
    }
    static boolean dfs(int[][] g1 , int[][] g2 , int r , int c , int[][] vis){
        vis[r][c]= 1  ;
        boolean flag = true ;
        if(g1[r][c]!=1) flag = false ;
        int[] dr = {-1,1,0,0} ;
        int[] dc = {0 , 0, -1 ,1} ;
        for(int j = 0 ; j<4 ; j++){
            int nr = r+dr[j] ;
            int nc = c+dc[j] ;
            if(nr>=0 && nr<g1.length && nc>=0 && nc<g1[0].length && g2[nr][nc]==1 && vis[nr][nc]==0){
                if(!dfs(g1 , g2 , nr , nc , vis)) flag = false ;
            }
        }
        return flag ;
    }
}