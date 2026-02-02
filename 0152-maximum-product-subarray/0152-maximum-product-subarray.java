class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int maxend= nums[0];
        int minend = nums[0];
        for(int i = 1 ; i<nums.length ;  i++){
            int v1 = nums[i];
            int v2 = nums[i]*maxend;
            int v3 = nums[i]*minend;
            maxend = Math.max(Math.max(v2,v3) , v1);
            minend = Math.min(Math.min(v2,v3) , v1);
            res = Math.max(res , Math.max(maxend , minend));
        }
        return res;
    }
}