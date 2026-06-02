class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int or = image[sr][sc];
        //image[sr][sc] = color ;
          if(or == color) return image;
        dfs(image , sr , sc , color,or) ;
        return image ;
    }
    static void dfs(int[][] image, int sr, int sc, int color,int or){
         image[sr][sc] = color ;
         int[] dr = {-1,1,0,0} ;
         int[] dc={0,0,-1,1} ;
         for(int i = 0 ; i<4 ; i++){
            int nr = sr + dr[i] ;
            int nc = sc + dc[i] ;
            if(nr>=0&& nr<image.length && nc>=0 && nc<image[0].length && image[nr][nc]==or){
                dfs(image , nr ,nc , color ,or) ;
            }
         }
    }
}