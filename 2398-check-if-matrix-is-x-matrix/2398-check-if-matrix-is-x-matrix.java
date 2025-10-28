class Solution {
    public boolean checkXMatrix(int[][] grid) {
       int rows=grid.length;
       int col=grid[0].length;
       for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            if(i==j){
                if(grid[i][j]==0){
                    return false;
                }}
            else if(i+j==col-1){
                if(grid[i][j]==0){
                    return false;
                }
            }
            else if(grid[i][j]!=0&&(i!=j)&&(i+j!=(col-1))){
                return false;
            }
            }
        }
        return true;
       } 
       
    }
