class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n] ;
         List<List<String>> ans = new ArrayList<>();
         for(int i = 0 ; i< n ; i++){
            Arrays.fill(arr[i],'.');
         }
         solve(arr , ans ,0, n);
         return ans ;
    }
    static void solve(char[][] arr , List<List<String>> ans ,int row , int n){
        if(row==n){
            ArrayList<String> l = new ArrayList<>();
        for(int i = 0 ; i<n ; i++ ){
         String s = "" ;
          for(int j = 0 ;j<n ; j++){
            s+=arr[i][j];}
            l.add(s);}
         ans.add(l);
    return ;}
        
        for(int i = 0 ; i<n ; i++){
            if(isSafe(arr , row , i,n)){
            arr[row][i] = 'Q';
            solve(arr ,ans, row+1  ,n );
            arr[row][i] = '.' ;
        }}
    }
    static boolean isSafe(char[][] arr , int r , int c , int n){
        //check column 
        for(int i = 0 ; i<r ; i++){
            if(arr[i][c]=='Q')
            return false;
        }
        //// left diagonal
        for(int i = r-1, j = c-1; i >= 0 && j >= 0; i--, j--){
            if(arr[i][j] == 'Q') return false;
        
    }
    //right diagonal 
     for(int i = r-1, j = c+1; i >= 0 && j < n; i--, j++){
            if(arr[i][j] == 'Q') return false;
        }
        return true ;}}
    
    // static List<List<String>> construct(char[][] arr ,List<List<String>> ans , int n){
    //     ArrayList<String> l = new ArrayList<>();
    //     for(int i = 0 ; i<n ; i++ ){
    //      String s = "" ;
    //       for(int j = 0 ;j<n ; j++){
    //         s+=arr[i][j];}
    //         l.add(s);}
    //      ans.add(l);
    // return ans;}}