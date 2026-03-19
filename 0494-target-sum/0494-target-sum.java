class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int ans = recurse(nums , target , 0);
        return ans ;
    }
    static int recurse(int[] nums, int target , int index){
        if(index==nums.length){
            return target==0?1:0 ;
        }
        int add = recurse(nums,target+nums[index],index+1);
        int sub = recurse(nums , target-nums[index] , index+1);
        return add+sub ;
    }
}