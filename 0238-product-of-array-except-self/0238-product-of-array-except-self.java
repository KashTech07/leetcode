class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] =1 ;
        int suf = res[nums.length-1] ;
        int pre = 1 ;
        for(int i = 1 ; i<nums.length ; i++){
            res[i] = nums[i-1]*pre ;
            pre = res[i] ;
        }
        suf = nums[nums.length-1] ;
        for(int i = nums.length-2 ; i>=0 ; i--){
            res[i]*=suf;
            suf = suf*nums[i] ;
        }
        return res;}}

