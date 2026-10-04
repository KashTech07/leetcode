class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // Queue<Integer> q = new LinkedList<>() ;
        // boolean[] visited = new boolean[rooms.size()] ;
        // q.add(0) ;
        // visited[0] = true ;
        // while(!q.isEmpty()){
        //     int num = q.poll() ;
        //     for(int a : rooms.get(num)){
        //         if(!visited[a]){
        //             visited[a] = true ;
        //             q.add(a) ;
        //         }
        //     }}
        // for(boolean v : visited){
        //     if(!v) return false ;
        // }
        // return true ;}}

        int[] vis = new int[rooms.size()] ;
                dfs(rooms , vis , 0);
        for(int n : vis){
            if(n==0) return false; 
        }
        return true ;
    }
    static void dfs(List<List<Integer>> list , int[] vis , int i){
        vis[i]=1 ;
        for(int n : list.get(i)){
            if(vis[n]==0) {
            dfs(list , vis , n) ;
            }
        }
    }
}