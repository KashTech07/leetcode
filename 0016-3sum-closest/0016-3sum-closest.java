class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int mindiff =Integer.MAX_VALUE ;
       Arrays.sort(nums);
        int result = 0 ;
       for(int i = 0 ; i<nums.length-1 ; i++){
        if(i>0 && nums[i]==nums[i-1]) continue ;
        int j = i+1 ;
        int k = nums.length-1 ;
         while(j<k){
        int sum = nums[i]+nums[j]+nums[k] ;
        int diff = Math.abs(sum-target );
       if(mindiff>diff){
        mindiff = diff ;
        result = sum ;
       }
        if (sum == target) return target;
        if(sum>target){
            k-- ;
        }
        else{
            j++ ;
        }
       }}
       return result ;
    }
}