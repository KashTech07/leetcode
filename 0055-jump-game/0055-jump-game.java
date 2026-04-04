class Solution {
    public boolean canJump(int[] nums) {
        
        int maxfind = 0;
        int n = nums.length ;
       for(int i= 0 ; i<n ; i++){
        if(i>maxfind) return false ;
        maxfind = Math.max(maxfind , i+nums[i]) ;
       }
       return true ;}}