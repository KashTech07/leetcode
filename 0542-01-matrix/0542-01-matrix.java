class tri {
    int r ;
    int c ;
    int d ;
    tri(int r , int c , int d){
        this.r = r ;
        this.c = c ;
        this.d = d ;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length; 
        int n = mat[0].length ;
        int[][] vis = new int[m][n] ;
        int[][] ans = new int[m][n] ;
        Queue<tri> q = new LinkedList<>() ;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0; j<n ; j++){
              if(mat[i][j]==0){
                q.add(new tri(i , j , 0)) ;
                vis[i][j]=1 ;
              }
            }
        }
        int[] dr ={-1,1,0,0} ;
        int[] dc = {0 , 0 ,-1,1};
        while(!q.isEmpty()){
             tri t = q.poll() ;
             int a = t.r ;
             int b = t.c;
             int c = t.d ;
             ans[a][b] =c ;
             for(int i = 0 ; i<4 ; i++){
                int nr = a+dr[i] ;
                int nc = b + dc[i] ;
                if(nr>=0 && nr<m && nc>=0 && nc<n &&  vis[nr][nc]==0){
                   vis[nr][nc]=1 ;
                   q.add(new tri(nr,nc,c+1)) ;
                }
             }
        }
        return ans ;
    }
}