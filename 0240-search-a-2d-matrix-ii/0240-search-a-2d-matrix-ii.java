class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length ; //number of rows
       int n = matrix[0].length ; // number of columns
       int row = m-1 ;
       int col = 0 ;
       while(row>=0&&col<n){
        if(matrix[row][col]==target){
            return true ;
        }
        else if(matrix[row][col]>target){
            row--;
        }
        else{
            col++;
        }
       }
       return false ;
    }
}