class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums) ;
        int maxlen = 1 ;
        int count = 1 ;
        if(nums.length==0) return 0 ;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i]==nums[i-1]) continue ;
            if(nums[i]==nums[i-1]+1){
                count++ ;
            }
            if(nums[i]!=nums[i-1]+1){
                count = 1 ;
            }
             maxlen = Math.max(maxlen , count) ;
        }
        return maxlen ;
    }
}