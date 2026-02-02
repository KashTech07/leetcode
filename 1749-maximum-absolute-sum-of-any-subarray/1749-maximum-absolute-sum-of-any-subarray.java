class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int bestmin = nums[0];
        int bestmax = nums[0];
        int res = Math.abs(nums[0]);
        int res1 = nums[0];
        int res2 = nums[0];
        for(int i = 1 ;i<nums.length ; i++){
            bestmin = Math.min(bestmin+nums[i] , nums[i]);
            bestmax = Math.max(bestmax+nums[i] , nums[i]);
             res1 = Math.max(res1 , bestmax);
             res2 = Math.min(bestmin , res2);
            res=Math.max(res , Math.max(Math.abs(res1), Math.abs(res2)));
        }
        return res ;
    }
}