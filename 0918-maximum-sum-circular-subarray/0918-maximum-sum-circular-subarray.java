class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentmax = 0 ;
        int maxsum  = Integer.MIN_VALUE ;
        int currentmin = 0 ;
        int minsum = Integer.MAX_VALUE ;
        int n = nums.length ;
        int totalsum = 0 ;
        for(int i = 0 ; i<n ; i++){
           currentmax = Math.max(nums[i] , currentmax+nums[i]) ;
           maxsum = Math.max(maxsum , currentmax) ;
           currentmin = Math.min(nums[i] , currentmin+nums[i]) ;
           minsum = Math.min(minsum , currentmin) ;
           totalsum +=nums[i] ;
        }
        if(maxsum<0) return maxsum ;
        int ans = totalsum-minsum ;
        return Math.max(maxsum , ans) ;}}
        
       