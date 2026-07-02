class pair{
    int dis ;
    int a ; 
    int b ;
    pair(int dis ,int a , int b){
        this.dis = dis ;
        this.a = a ;
        this.b = b ;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        if (grid[0][0] == 1 || grid[m-1][n-1] == 1) return -1;
        int[][] res = new int[m][n] ;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                res[i][j] = Integer.MAX_VALUE ;
            }
        }
        PriorityQueue<pair> q = new PriorityQueue<>((a,b)->a.dis-b.dis) ; 
        q.add(new pair(1,0,0)) ;
        res[0][0] = 1 ;
        while(!q.isEmpty()){
            pair p = q.poll() ;
            int d = p.dis ;
            int a = p.a ;
            int b = p.b ;
            for(int i = -1 ; i<=1 ; i++){
                for(int j = -1 ; j<=1 ; j++){
                    int nr = a+i ;
                    int nc = b+j ;
                    if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==0 && d+1<res[nr][nc]){
                        res[nr][nc] = d+1 ;
                        q.add(new pair(d+1 , nr , nc)) ;
                    }
                }
            }
        }
        return res[m-1][n-1]==Integer.MAX_VALUE ? -1 : res[m-1][n-1] ;

    }
}