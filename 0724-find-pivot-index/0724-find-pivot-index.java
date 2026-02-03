class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0 ;
        int prefix  = 0;
        int suffix = 0;
        for(int n : nums){
            sum+=n;
        }
        for(int i =0;i<nums.length ; i++){
            if(i==0){
                prefix = 0;
            }else{
            prefix = prefix+nums[i-1];}
            suffix=sum-prefix-nums[i];
            if(prefix==suffix){
                return i;
            }
        }
        return -1;
    }
}