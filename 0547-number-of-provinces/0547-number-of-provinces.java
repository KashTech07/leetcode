class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length ;
        int c= 0 ;
        boolean[] visited = new boolean[n] ;
        for(int i = 0 ;i<n ; i++){
            if(!(visited[i])){
                bfs(i , visited , isConnected) ;
                c++ ;
            }
        }
        return c ;
    }
    static void bfs(int i , boolean[] visited , int[][] isConnected){
        Queue<Integer> q = new LinkedList() ;
        int n = isConnected.length ;
        q.add(i) ;
        while(!q.isEmpty()){
            int front = q.poll() ;
            for(int j = 0 ;j<n ; j++){
                if(isConnected[front][j]==1 && visited[j]==false){
                    visited[j]=true ; 
                    q.add(j) ;
                }
            }
        }
    }

}