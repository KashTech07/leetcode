class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        int[][] ans = new int[k][2];
        for(int i = 0 ; i<points.length ; i++){
            q.add(points[i]);
            if(q.size()>k){
                q.poll();
            }
    }
    int x = 0; 
    while(!q.isEmpty()){
        ans[x]=q.poll();
        x++ ;
    }
    return ans ;
    }
}