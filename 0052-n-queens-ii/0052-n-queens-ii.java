class Solution {
     static int count =0;
    public int totalNQueens(int n) {
        int a = 0 ;
         count = 0;
        int[][] arr = new int[n][n];
        solve(arr , n  , 0);
        return count ;
    }
   
    static void solve(int[][] arr ,int n  , int row){
        if(row==n){
            count++ ;
            return  ;
        }
        for(int i = 0 ; i<n ; i++){
            if(isSafe(arr , row , i , n)){
                arr[row][i]=1 ;
            solve(arr , n , row+1);
            arr[row][i]=0;
            
        }
        
    }}
    static boolean isSafe(int[][] arr , int r , int c , int n){
        //column check 
        for(int i = 0 ;i<r ;i++){
            if(arr[i][c]==1) return false ;
        }
        //left diagonal
        for(int i = r-1 ,  j=c-1 ; i>=0 && j>=0 ; i-- ,j-- ){
            if(arr[i][j]==1) return false ;
        }
        //right diagonal 
        for(int i= r-1 , j=c+1 ; i>=0 && j<n ; i--,j++){
            if(arr[i][j]==1) return false ;
        }
        return true ;
    }
}