class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<int[]>> list = new ArrayList<>() ;
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for(int i = 0 ; i<roads.length ; i++){
            int a = roads[i][0] ;
            int b = roads[i][1] ;
            int wt = roads[i][2] ;
            list.get(a).add(new int[]{b,wt}) ;
            list.get(b).add(new int[]{a, wt});
        }
        long[] res = new long[n] ;
        Arrays.fill(res,Long.MAX_VALUE) ;
        res[0] = 0 ;
        long[] countpath = new long[n] ;
        countpath[0] = 1 ;
        PriorityQueue<long[]> q = new PriorityQueue<>((a,b)->Long.compare(a[1],b[1])) ;
        q.add(new long[]{0,0}) ;
        long MOD = 1_000_000_007;
        while(!q.isEmpty()){
            long[] ar = q.poll() ;
            int node = (int)ar[0] ;
            long dist = ar[1] ;
            if (dist > res[node]) continue;
            for(int[] neighbour : list.get(node)){
                int x = neighbour[0] ;
                int y = neighbour[1] ;
                if(dist+y<res[x]){
                    res[x] = dist+y ;
                     countpath[x] = countpath[node];
                    q.add(new long[]{x,y+dist}) ;
                }
                else if(dist+y==res[x]){
                    countpath[x]=(countpath[x] + countpath[node]) % MOD ;
                }
            }
        }
        return (int)countpath[n-1] ;
    }
}