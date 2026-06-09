class p {
    int r ;
    int c ;
    p(int r , int c){
        this.r = r ;
        this.c = c ;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<p> q = new LinkedList<>() ;
        int m = grid.length ;
        int n = grid[0].length ;
        int[][] vis = new int[m][n] ;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(i==0 || i==m-1 || j==0 || j==n-1){
                if(grid[i][j]==1){
                    q.add(new p(i,j)) ;
                    vis[i][j]=1 ;
                }}
            }
        }
        int[] dr = {-1,1,0,0} ;
        int[] dc ={0,0,-1,1} ;
        while(!q.isEmpty()){
            p p1 = q.poll() ;
            int row = p1.r ;
            int col = p1.c ;
            for(int i = 0 ; i<4 ; i++){
                int nr = row+dr[i] ;
                int nc = col+dc[i] ;
                if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1 && vis[nr][nc]==0){
                    vis[nr][nc]=1 ;
                    q.add(new p(nr ,nc)) ;
                }
            }
        }
        int count = 0;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    count++ ;
                }
            }
        }
        return count ;
    }
}