class Solution {

    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length + 1;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for(int[] e : edges) {

            int u = e[0];
            int v = e[1];

            int[] vis = new int[n];

            if(dfs(list, vis, u, v)) {
                return e;
            }

            list.get(u).add(v);
            list.get(v).add(u);
        }

        return new int[0];
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> list,
                       int[] vis,
                       int i,
                       int destination) {

        if(i == destination)
            return true;

        vis[i] = 1;

        for(int n : list.get(i)) {

            if(vis[n] == 0) {

                if(dfs(list, vis, n, destination))
                    return true;
            }
        }

        return false;
    }
}
