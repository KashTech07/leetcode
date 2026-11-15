class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>() ;
        int n = isConnected.length ;
        for(int i = 0 ; i<n ; i++){
            list.add(new ArrayList<>()) ;
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                if(isConnected[i][j]==1){
                    list.get(i).add(j) ;
                }
            }
        }
        int[] vis = new int[n] ;
        int c = 0 ;
        for(int i = 0 ; i<n ; i++){
            if(vis[i]!=1){
                  c++ ;
                dfs(vis , list , i) ;
            }
        }
        return c ;
    }
    static void dfs(int[] vis , ArrayList<ArrayList<Integer>> list , int i){
        vis[i] = 1 ;
        for(int n : list.get(i)){
            if(vis[n]==0){
                dfs(vis , list , n) ;
            }
        }
    }
}