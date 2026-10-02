class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
//          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             adj.add(new ArrayList<>());
//         }

//         for (int[] e : edges) {
//             int u = e[0], v = e[1];
//             adj.get(u).add(v);
//             adj.get(v).add(u); 
//         }

//         boolean[] visited = new boolean[n] ;
//         Queue<Integer> q = new LinkedList<>() ;
//         q.add(source) ;
//         visited[source] = true ;
//         while(!q.isEmpty()){
//             int num = q.poll() ;
//             if(num==destination) return true ;
//             for(int a : adj.get(num)){
//                if(!visited[a]){
//                 visited[a] = true ;
//                 q.add(a) ;
//                }
//             }
//         }
//         return false ;

//     }
// }
ArrayList<ArrayList<Integer>> graph = new ArrayList<>() ;
for(int i = 0 ; i<n ; i++ ) graph.add(new ArrayList<>()) ;
for(int[] e : edges){
    int u = e[0] ;
    int v = e[1] ;
    graph.get(u).add(v) ;
    graph.get(v).add(u) ;
}
boolean[] vis = new boolean[n] ;
return dfs(graph , n , source , destination , vis) ;}
static boolean dfs(ArrayList<ArrayList<Integer>> list , int n , int src , int dest , boolean[] vis){
    if(src==dest) return true ;
    vis[src] = true ;
    for(int neigh : list.get(src)){
        if(!vis[neigh]){
           if( dfs(list , n , neigh , dest , vis))
           return true ;
        }
    }
    return false ;
}}