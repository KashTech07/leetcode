class Solution {
    public int diagonalSum(int[][] mat) {
       int rows=mat.length;
       int col=mat[0].length ;
       int count1=0;
       int count2=0;
       for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            if(i==j){
                count1+=mat[i][j];
            }
            else if(i+j==(col-1)&& i!=j){
                count2+=mat[i][j];
            }
            else {
                continue;
            }
        }}
        return count1+count2;
       
    }
}