class Solution {
    public void sortColors(int[] nums) {
        int start = 0 ;
        int mid = 0 ;
        int end = nums.length-1 ;
       while(mid<=end){
           if(nums[mid]==2){
            int t = nums[mid] ;
            nums[mid]=nums[end] ;
            nums[end] = t ;
            end-- ;
           }
           else if(nums[mid]==0){
            int t = nums[mid] ;
            nums[mid]=nums[start] ;
            nums[start] =t ;
            start ++ ;
             mid++ ;
           }
           else mid++ ;
          
        }
    
    
}}