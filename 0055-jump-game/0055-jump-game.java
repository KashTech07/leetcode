class Solution {
    public boolean canJump(int[] nums) {
        int maxsum = 0 ;
        int i = 0;
        int n = nums.length ;
        while(i<n){
            if(i>maxsum) return false ;
            maxsum = Math.max(maxsum , i + nums[i]) ;
            i++ ;
        }
        return true ;
    }
}