class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = max(weights);
        int end = sum(weights);
        int ans = 0 ;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(CanBeShipped(weights , mid , days)){
                ans= mid ;
                end = mid-1 ;
            }
            else{
                start = mid+1 ;
            }
        }
        return ans ;
    }
    static boolean CanBeShipped(int[] arr , int mid , int k){
        int days = 1 ;
        int sum = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(sum+arr[i]>mid){
                days++;
                sum = arr[i];
            }
            else sum +=arr[i];}
            
        if(days<=k) return true ;
        return false;
    }
    static int max(int[] arr){
        int ans = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]>ans){
               ans = arr[i] ;
            }
        }
        return ans ;
    }
    static int sum(int[] arr){
        int sum = 0 ;
        for(int n : arr){
            sum+=n;
        }
        return sum;
    }
}