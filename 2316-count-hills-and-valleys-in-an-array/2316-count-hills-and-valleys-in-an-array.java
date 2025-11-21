class Solution {
    public int countHillValley(int[] nums) {
      int count = 0;
     for(int i = 1 ; i<nums.length-1 ; i++){
        if(nums[i]==nums[i-1]){

            continue;
        }
        int j =i+1 ;
        int k = i-1;
     while(j<nums.length&&nums[i]==nums[j]){
        j++;
     }
     while(k>=0&&nums[i]==nums[k]){
        k--;
     }
     if(k<0||j>=nums.length){
        continue;
     }
     if(nums[i]>nums[j]&&nums[i]>nums[k]){
        count ++;
     }
     else if (nums[i]<nums[j]&&nums[i]<nums[k])
     count++;}
     return count ;}}
