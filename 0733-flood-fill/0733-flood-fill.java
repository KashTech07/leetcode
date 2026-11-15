class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length ;
        int n = image[0].length ;
       // int[][] vis = new int[m][n] ;
        if(image[sr][sc]==color) return image ;
       // vis[sr][sc]=1 ;
       int c = image[sr][sc] ;
        dfs(image , sr , sc , color  , c) ;
        return image ; }

        static void dfs(int[][] image, int r, int c, int color  , int c1){
            //vis[r][c] = 1 ;
            image[r][c] = color ;
            int[] dr = { -1,1, 0 , 0} ;
            int[] dc= {0 , 0 , -1,1} ;
            for(int i = 0 ; i <4 ; i++){
                int nr = r+dr[i] ;
                int nc = c+dc[i] ;
                if(nr>=0 && nr<image.length && nc>=0 && nc<image[0].length  && image[nr][nc]==c1){
                    dfs(image , nr  , nc , color  ,c1) ;
                }
            }
        }
}