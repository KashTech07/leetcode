class Solution {
    public int[] rearrangeArray(int[] nums) {
      int[] arr = new int[nums.length] ;
      int neg = 1 ;
      int pos = 0 ;
      //int curr = 0;
      for(int curr = 0 ;curr<nums.length ; curr++){
          if(nums[curr]>0){
            arr[pos] = nums[curr] ;
            pos = pos + 2 ;
          }
          else{
            arr[neg] = nums[curr];
            neg = neg+2 ;
          }
      }
      return arr; 
    }
}