class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int start = matrix[0][0];
        int ans=0;
        int m = matrix.length ; 
        int n = matrix[0].length;
        int end = matrix[m-1][n-1];
        while(start<=end){
            int mid = start + (end-start)/2 ;
            int c = countSmaller(matrix , mid , m ,n );
            if(c>=k){
                ans = mid ;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            }
        return ans ;
    }
    static int countSmaller(int[][] matrix , int mid , int m, int n){
        int count = 0;
        int r = m-1 ;
        int c = 0;
        while(r>=0 && c<n){
            if(matrix[r][c]<=mid){
                count+=r+1 ;
                c++ ;
            }
            else{
                  r-- ;
            }
        }
           return count ;
    }
}