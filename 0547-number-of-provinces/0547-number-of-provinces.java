class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>() ;
        for(int i= 0 ; i<isConnected.length ; i++){
            adj.add(new ArrayList<>()) ;
        }
        for(int i = 0 ; i<isConnected.length ; i++){
            for(int j = 0 ; j<isConnected.length ; j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j) ;
                    adj.get(j).add(i) ;
                }
            }
        }
        int c=0;
        int[] vis = new int[isConnected.length] ;
        for(int i = 0 ; i<isConnected.length ; i++){
            if(vis[i]==0){
                 c++ ;
                dfs(vis , adj , i) ;
            }
        }
        return c ;
    }
    static void dfs(int[] vis ,ArrayList<ArrayList<Integer>> adj , int i ){
        vis[i]=1 ;
        for(int n: adj.get(i)){
            if(vis[n]==0){
                dfs(vis , adj ,n) ;
            }
        }
    }
}