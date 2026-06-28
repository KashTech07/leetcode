class pair{
    int dis ;
    int node ;
    pair(int dis , int node){
        this.dis= dis;
        this.node = node;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>() ;
        int ans = Integer.MIN_VALUE ;
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i<times.length ; i++){
            int u = times[i][0] ;
            int v = times[i][1] ;
            int w = times[i][2] ;
            ArrayList<Integer> neighborU = new ArrayList<>(Arrays.asList(v , w)) ;
            adj.get(u).add(neighborU) ;
        }
        int[] dist = new int[n+1] ;
        for(int i = 0 ; i<=n ; i++) dist[i]=Integer.MAX_VALUE ;
        dist[k]= 0 ;
        PriorityQueue<pair> q = new PriorityQueue<>((x,y)->x.dis-y.dis) ;
        q.add(new pair(0 , k)) ;
        while(!q.isEmpty()){
            pair p = q.poll() ;
            int d = p.dis ;
            int n2 = p.node ;
             if(d>dist[n2]) continue ;
            for(int i = 0 ; i<adj.get(n2).size() ; i++){
                int edge = adj.get(n2).get(i).get(1) ;
                int n1 = adj.get(n2).get(i).get(0) ;
                if(edge+d<dist[n1]){
                    dist[n1]=edge+d ;
                    q.add(new pair(dist[n1], n1)) ;
                 }
            }
        }
        for(int i = 1 ; i<dist.length ; i++){
            if(dist[i]==Integer.MAX_VALUE) return -1 ;
            ans = Math.max(ans , dist[i]) ;
        }
        return ans ;
    }
}