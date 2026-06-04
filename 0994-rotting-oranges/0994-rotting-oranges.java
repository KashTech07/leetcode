class pair {
    int r ;
    int c ;
    int t ;
    pair(int r , int c , int t){
        this.c = c ; this.r = r ; 
        this.t = t ;
    }
}


class Solution {
    public int orangesRotting(int[][] grid) {
        int cntf = 0;
        int cnt = 0;
        int ans = 0 ;
        int m = grid.length ; 
        int n = grid[0].length ;
        Queue<pair> q = new LinkedList<>() ;
        for(int i = 0 ; i <m ; i++){
            for(int j = 0 ; j < n ;j++){
                if(grid[i][j]==2) q.add(new pair(i , j ,0)) ;
                if(grid[i][j]==1) cntf++ ;
            }
        }
        int[] dr = {-1,1,0,0} ;
        int[] dc = {0,0,-1,1} ;
        while(!q.isEmpty()){
            pair p = q.poll() ;
            int a = p.r ;
            int b = p.c ;
            int tm = p.t ;
            ans = Math.max(ans , tm) ;
            for(int i = 0 ; i<4 ; i++){
                int row = a + dr[i] ;
                int col = b + dc[i] ;
                if(row>=0 && row<m && col>=0 && col<n && grid[row][col]==1){
                    cnt++ ;
                    q.add(new pair(row , col , tm+1));
                    grid[row][col]=2 ;
                }
            }
        }
        if(cnt!=cntf) return -1 ;
        return ans ;
    }
}