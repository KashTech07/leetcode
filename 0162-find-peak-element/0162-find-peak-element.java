class Solution {
    public int findPeakElement(int[] nums) {
       int start = 0 ;
       int end = nums.length-1 ;
    //    if(nums.length<=1) return 0;
    //    if (nums.length==2){
    //   if(nums[0]>nums[1]) return 0 ;
    //   if(nums[end]<nums[end-1]) return end-1;}
       while(start<end){
        int mid = start + (end-start)/2 ;
        if(nums[mid+1]<nums[mid]){
            end = mid;
        }
        else{
            start = mid+1 ;
        }
       }
       return start ; 
    }
}