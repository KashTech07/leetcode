class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
      int start = 1 ;
      int end = max(quantities) ;
      int ans = 0;
      while(start<=end){
        int mid = start + (end-start)/2 ;
        if(can(n , quantities , mid)){
            ans = mid ;
            end = mid-1 ;
        }
        else{
            start = mid+1 ;
        }
      } 
      return ans ; 
    }
    static boolean can(int n , int[] arr , int mid){
        int sum = 0; 
        for(int  i = 0 ; i<arr.length ; i++){
            sum+=(arr[i]+mid-1)/mid ; }
        return n>=sum ;
    }
    static int max(int[] arr){
        int ans = arr[0]; 
        for(int n : arr){
            if(n>ans){
                ans = n ;
            }
        }
        return ans ;
    }
}