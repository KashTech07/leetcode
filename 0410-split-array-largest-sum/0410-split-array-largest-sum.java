class Solution {
    public int splitArray(int[] nums, int k) {
        int start  = max(nums);
        int end = sum(nums);
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(canBeSplitted(nums,mid,k)){
                ans  = mid ;
                end = mid-1 ;
            }
            else{
                start = mid+1 ;
            }
        }
        return ans ;
    }
    static boolean canBeSplitted(int[] arr , int mid , int k){
        int sa = 1 ;
        int sum = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(sum+arr[i]>mid){
                sa++ ; 
                sum = arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        if(sa<=k) return true ;
        return false;
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