class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>() ;
        ArrayList<Integer> curr = new ArrayList<>() ;
        curr.add(0) ;
        dfs(graph , list ,0, curr) ;
        return list ;
    }
    static void dfs(int[][] graph , List<List<Integer>> list ,int node , ArrayList<Integer> curr ){
        if(node==graph.length-1){
            list.add(new ArrayList<>(curr)) ;
            return ;
        }
        for(int i = 0 ; i<graph[node].length ; i++){
            curr.add(graph[node][i]) ;
            dfs(graph , list , graph[node][i], curr) ;
            curr.remove(curr.size()-1) ;
        }
    }

}