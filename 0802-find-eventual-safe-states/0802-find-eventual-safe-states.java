class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>() ;
        int[] vis = new int[graph.length] ;
        int[] pathvis = new int[graph.length] ;
        int[] check = new int[graph.length] ;
        for(int i = 0 ; i<graph.length ; i++){
            if(vis[i]==0){
                dfsCheck(vis , pathvis , graph , i ,check) ;
         }
            }
            for(int i = 0 ; i<check.length ; i++){
                if(check[i]==1){
                    ans.add(i) ;
                }
            }
            return ans ;
        }
        static boolean dfsCheck(int[] vis , int[] pathvis , int[][] graph , int node , int[] check){
          vis[node] = 1 ;
          pathvis[node] = 1; 
          check[node] = 0;
          for(int n : graph[node]){
            if(vis[n]==0){
               if(dfsCheck(vis , pathvis , graph , n , check)==true) return true ;
            }
            else if(pathvis[n]==1) return true;
          }
        
        pathvis[node] = 0 ;
        check[node] = 1 ;
        return false ;
    } 
}