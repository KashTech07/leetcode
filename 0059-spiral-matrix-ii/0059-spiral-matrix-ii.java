class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n] ;
        int left = 0 ; 
        int right = n-1 ;
        int bottom = n-1 ;
        int top = 0 ;
        int a = 1 ;
        while(top<=bottom && left<=right){
            for(int i = top ; i<=right ; i++){
                mat[top][i] = a ;
                a++ ;
            }
            top++ ;

            for(int i = top ; i<=bottom ; i++){
                mat[i][right] = a ;
                a++ ;
            }
            right-- ;
            if(top<=bottom){
                for(int i = right ; i>=left ; i--){
                    mat[bottom][i] = a ; 
                    a++ ;
                }
                bottom-- ;
            }
            if(left<=right){
                for(int i = bottom ; i>=top ; i--){
                 mat[i][left] = a;
                    a++;
                 }
                 left++ ;
        }}
        return mat ;
    }
}