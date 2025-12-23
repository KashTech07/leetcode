class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int result = 0;
       int mindiff = Integer.MAX_VALUE;
       for(int i = 0 ;i<nums.length -2 ; i++){
        if(i>0&&nums[i]==nums[i-1]){
            continue ;
        }
        int j = i+1;
        int k = nums.length - 1;
        while(j<k){
        int sum = nums[i]+nums[j]+nums[k];
        int diff= Math.abs(sum-target);
        if(diff<mindiff){
            mindiff=diff;
            result = sum;
        }
        if(sum>target){
            k--;
        }
        else{
            j++;
        }
       } }
       return result;
    }
}