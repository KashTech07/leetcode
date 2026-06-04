class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int j = 0 ;
        int ans = 0;
        int prod = 1 ;
        if(k==0||k==1) return 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            prod *= nums[i] ;
            while(prod>=k){
              prod = prod/nums[j] ;
              j++ ;
            }
            ans = ans+i-j+1 ;
        }
        return ans ;}}