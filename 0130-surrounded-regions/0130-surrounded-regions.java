class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        
        int m = board.length;
        int n = board[0].length;
        int[][] vis = new int[m][n];
        
        // 1. Traverse Top and Bottom Boundaries (Loop through columns 0 to n-1)
        for (int j = 0; j < n; j++) {
            if (vis[0][j] == 0 && board[0][j] == 'O') {
                dfs(0, j, vis, board);
            }
            if (vis[m - 1][j] == 0 && board[m - 1][j] == 'O') {
                dfs(m - 1, j, vis, board);
            }
        }
        
        // 2. Traverse Left and Right Boundaries (Loop through rows 0 to m-1)
        for (int i = 0; i < m; i++) {
            if (vis[i][0] == 0 && board[i][0] == 'O') {
                dfs(i, 0, vis, board);
            }
            if (vis[i][n - 1] == 0 && board[i][n - 1] == 'O') {
                dfs(i, n - 1, vis, board);
            }
        }
        
        // 3. Flip all unvisited 'O's to 'X's
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (vis[i][j] == 0 && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
    
    static void dfs(int r, int c, int[][] vis, char[][] mat) {
        vis[r][c] = 1;
        
        // 4-directional movement vectors
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            
            // Check boundaries, visited array, and if it's an uppercase 'O'
            if (nr >= 0 && nr < mat.length && nc >= 0 && nc < mat[0].length 
                && vis[nr][nc] == 0 && mat[nr][nc] == 'O') {
                dfs(nr, nc, vis, mat);
            }
        }
    }
}