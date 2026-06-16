class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] vis = new int[numCourses] ;
        int[] pathvis = new int[numCourses] ;
        int[] check = new int[numCourses] ;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>() ;
        for(int i = 0 ; i<numCourses ; i++){
            list.add(new ArrayList<>()) ;}
        for(int i = 0 ; i<prerequisites.length ; i++){
            int u = prerequisites[i][0] ;
            int v = prerequisites[i][1] ;
            list.get(u).add(v) ;
        }
        for(int i = 0 ; i<numCourses ; i++){
            if(vis[i]==0){
                if(dfs(vis , pathvis , list , check , i)==true) return false ;
            }
        }
        return true ;}

        static boolean dfs(int[] vis , int[] pathvis , ArrayList<ArrayList<Integer>> list , int[] check , int i){
            vis[i]=1 ;
            pathvis[i]=1 ;
            check[i]=0 ;
            for(int n : list.get(i)){
                if(vis[n]==0){
                 if(dfs(vis,pathvis , list , check , n)==true) return true ;
                }
                else if(pathvis[n]==1) return true ;
            }
            pathvis[i]=0 ;
            check[i]=1 ;
            return false ;
        }}
            