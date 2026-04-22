class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // undirected graph
        }

        boolean[] visited = new boolean[n] ;
        Queue<Integer> q = new LinkedList<>() ;
        q.add(source) ;
        visited[source] = true ;
        while(!q.isEmpty()){
            int num = q.poll() ;
            if(num==destination) return true ;
            for(int a : adj.get(num)){
               if(!visited[a]){
                visited[a] = true ;
                q.add(a) ;
               }
            }
        }
        return false ;

    }
}