class Solution {
    public int countElements(int[] nums) {
      Arrays.sort(nums);
      int i=1;
      int k = nums.length - 1;
        while(i<nums.length && nums[i]==nums[0]){
            i++;
        }
        
        while(k>=0 && nums[k]==nums[nums.length-1]){
            k--;
        }
 
      return Math.max(0,k-i+1);  
    }
}