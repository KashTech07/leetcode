class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] vis = new int[graph.length] ;
         for(int i = 0 ; i<graph.length ; i++) vis[i]=-1 ;
        for(int i = 0 ; i<graph.length ; i++){
            if(vis[i]==-1 ){
                if(check(i , 0,graph , vis)==false) return false;
            }
        }
        return true ;
    }
    static boolean check(int s ,int c ,  int[][] g , int[] vis){
         vis[s]=c ;
         for(int n : g[s]){
            if(vis[n]==-1){
                if(!check(n,1-c,g,vis)) return false ;}
            else if (vis[n]==vis[s]) return false ;
                        }
            return true ;
    }
}