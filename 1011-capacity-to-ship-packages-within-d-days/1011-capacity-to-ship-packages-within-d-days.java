class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = max(weights) ;
        int end = sum(weights) ;
        int ans = 0;
        while(start<=end){
            int mid = start +(end-start)/2 ;
            if(canTake(weights , days , mid)){
                ans = mid ;
                end = mid-1 ;
            }
            else{
                start = mid+1 ;
            }
        }
        return ans ;
    }
    static boolean canTake(int[] arr, int k , int mid){
        int sum = 0 ;
        int day = 1 ;
        for(int i= 0 ; i<arr.length ; i++ ) {
            if(sum+arr[i]>mid){
                day++ ;
                sum = arr[i] ;
            }
            else{
                sum+=arr[i] ;
            }
        }
        if(day<=k) return true ;
        return false ;
    }
    static int max(int[] arr){
        int ans = arr[0];
        for(int n : arr){            
               if(n>ans){
                ans= n ;
            }}
            return ans ;
    }
    static int sum(int[] arr){
        int ans = 0;
        for(int n : arr){            
               
                ans += n ;
            }
            return ans ;
    }

}