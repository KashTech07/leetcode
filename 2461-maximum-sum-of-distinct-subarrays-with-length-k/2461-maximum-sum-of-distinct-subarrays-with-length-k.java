class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>() ;
        long sum = 0 ;
        long ans = 0 ;
        int j = 0 ;
        for(int i = 0 ; i< nums.length ; i++){
             map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1) ;
            sum+=nums[i] ;
            while(i-j+1 >k){
               map.put(nums[j] , map.get(nums[j])-1) ;
               if(map.get(nums[j])==0) map.remove(nums[j]) ;
               sum-=nums[j] ;
               j++ ;
            } 
            if(i-j+1 ==k && map.size()==k) ans = Math.max(ans , sum) ; 
           
        }
        return ans ;
    }
}