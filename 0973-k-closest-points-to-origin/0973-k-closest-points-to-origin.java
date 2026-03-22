class pair{
    int f ;
    int s ;
    pair(int f , int s){
        this.f = f ;
        this.s = s ;
    }
}


class Solution {
    public int[][] kClosest(int[][] points, int k) {
       int[][] ans = new int[k][2] ;
       PriorityQueue<pair> q = new PriorityQueue<>((a,b)->((a.f*a.f+ a.s * a.s)-(b.f*b.f + b.s*b.s))) ; 
       for(int i = 0 ; i<points.length ; i++) {
        q.add(new pair(points[i][0] , points[i][1])) ;
       }
       int j = 0 ;
       int x = 0 ;
       while(!q.isEmpty() && j<k){
        pair p = q.poll() ;
        ans[x][0] = p.f ;
        ans[x][1] = p.s ;
        x++ ;
        j++ ;
       }
       return ans ;
    }
}