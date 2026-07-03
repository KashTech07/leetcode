class pair{
    int diff ;
    int a ; 
    int b ;
    pair(int diff , int a , int b){
        this.diff = diff ;
        this.a = a ; 
        this.b = b ;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length ;
        int n = heights[0].length ;
        int[][] res  = new int[m][n] ;
        PriorityQueue<pair> q = new PriorityQueue<>((a,b)->a.diff-b.diff) ;
        for(int i= 0 ; i<m ; i++){
            for(int j = 0 ; j < n ; j++){
                res[i][j]=Integer.MAX_VALUE ;
            }
        }
         int[] dr = {-1,1,0,0} ;
        int[] dc = {0,0,1,-1} ;
        res[0][0] = 0;
        q.add(new pair(0 , 0 , 0)) ;
        while(!q.isEmpty()){
            pair p = q.poll() ;
            int d = p.diff ;
            int r = p.a ;
            int c = p.b ;
          for(int i = 0 ; i <4 ; i++){
            int nr = r+dr[i] ;
            int nc = c+dc[i] ;
            if(nr>=0 && nr<m && nc>=0 && nc<n ){
            int num = Math.max(d , Math.abs(heights[r][c]-heights[nr][nc]));
           if(num<res[nr][nc]){
            res[nr][nc] = num ;
            q.add(new pair(num , nr , nc)) ;
           }
          }}
        }
        return res[m-1][n-1] ;
    }
}