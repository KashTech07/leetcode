class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>() ;
        int[] indegree = new int[numCourses] ;
        int[] vis = new int[numCourses] ;
        for(int i = 0 ; i<numCourses ; i++){
            list.add(new ArrayList<>()) ;
        }
        for(int i = 0 ; i<prerequisites.length ; i++){
            int u = prerequisites[i][0] ;
            int v = prerequisites[i][1] ;
            list.get(v).add(u) ;
        }
        for(int i = 0 ; i<numCourses ; i++){
            for(int n : list.get(i)){
                indegree[n]++ ;
            }
        }
        Queue<Integer> q = new LinkedList<>() ;
        int[] topo = new int[numCourses] ;
        int x = 0;
        for(int i = 0 ; i<numCourses ; i++){
            if(indegree[i]==0) q.add(i) ;
        }
        while(!q.isEmpty()){
            int n = q.poll() ;
            topo[x++]=n ;
            for(int i : list.get(n)){
                indegree[i]-- ;
                if(indegree[i]==0) q.add(i) ;
            }
        }
        if(x==numCourses)
        return topo ;

        return new int[0] ;
    }
}