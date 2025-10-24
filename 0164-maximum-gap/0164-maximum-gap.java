class Solution {
    public int maximumGap(int[] nums) {
        int maxgap=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            maxgap=Math.max(maxgap,nums[i]-nums[i-1]);
        }
        return maxgap;
    }
}