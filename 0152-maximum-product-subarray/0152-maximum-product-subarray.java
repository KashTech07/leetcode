class Solution {
    public int maxProduct(int[] nums) {
      int minprod = nums[0] ;
      int maxprod = nums[0] ;
      int res = nums[0] ;
      for(int i = 1 ; i < nums.length ; i++){
         int u = nums[i] ;
         int v = maxprod*nums[i] ;
         int w= minprod*nums[i] ;
         maxprod =Math.max(Math.max(v,w) , u) ;
         minprod = Math.min(Math.min(v,w) , u) ;
         res = Math.max(res , Math.max(minprod,maxprod)) ;
      }
      return res ;}}