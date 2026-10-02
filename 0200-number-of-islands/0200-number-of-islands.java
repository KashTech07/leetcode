class Solution {
    public int numIslands(char[][] grid) {
//         int[][] vis = new int[grid.length][grid[0].length] ;
//         int c= 0 ;
//         for(int i = 0 ; i<grid.length ; i++){
//             for(int j = 0 ; j<grid[0].length ; j++){
//                 if(grid[i][j]=='1' && vis[i][j]==0){
//                     c++ ;
//                     dfs(i , j , grid , vis) ;
//                 }
//             }
//         }
//         return c;
//     }
//     static void dfs(int r , int c , char[][] grid , int[][] vis){
//         vis[r][c]=1 ;
//         int[] dr = {-1 , 1,0 , 0} ;
//         int[] dc = {0 , 0 ,-1 , 1} ;
//             for(int j = 0 ; j<4 ; j++){
//                 int nr = r+dr[j];
//                 int nc = c+dc[j];
//                 if(nc>=0 && nc<grid[0].length && nr>=0 && nr<grid.length && grid[nr][nc]=='1' && vis[nr][nc]==0){
//                     dfs(nr , nc, grid , vis) ;
//                 }
//             }
        
//     }
// }
//int c = 0 ;
int[][] vis = new int[grid.length][grid[0].length] ;
int c = 0 ;
for(int i=0 ;i < grid.length ; i++){
    for(int j = 0 ; j<grid[0].length ; j++){
        if(grid[i][j]=='1' && vis[i][j]==0) {
            c++ ;
            dfs(grid , vis , i , j) ;
        }
    }
} return c ;}
static void dfs(char[][] mat , int[][] vis , int r , int c){
    vis[r][c] = 1 ;
    int[] dr = {-1 , 1 , 0 , 0} ;
    int[] dc= {0 , 0 , -1 , 1} ;
    for(int i=0 ; i<4 ; i++){
        int vr = r + dr[i] ;
        int vc = c + dc[i] ;
        if(vr>=0 && vr<mat.length && vc>=0 && vc<mat[0].length && mat[vr][vc]=='1' && vis[vr][vc]==0){
            dfs(mat , vis , vr , vc) ;
        }
    }
}
}