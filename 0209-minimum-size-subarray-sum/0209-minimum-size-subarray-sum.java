class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int i = 0;
        int lsum=0;
        int len =Integer.MAX_VALUE;
        for(int num : nums){
            lsum +=num;
        }
        if(lsum<target){
            return 0 ;
        }
        for(int j =0 ; j<nums.length ; j++){
            sum+=nums[j];
            while(target<=sum){
                len = Math.min(len , j-i+1);
                sum=sum-nums[i];
                i++;
            }
        }
        return len;
    }
}