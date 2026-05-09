class Solution {
    public int countCompleteSubarrays(int[] nums) {
          int k = (int) Arrays.stream(nums).distinct().count();
          int j = 0 ;
          int result = 0 ;
          HashMap<Integer , Integer> map = new HashMap<>() ;
          for(int i =0 ;i<nums.length ; i++){
               map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1) ;
               while(map.size()==k){
                result+=nums.length-i ;
                map.put(nums[j] , map.get(nums[j])-1) ;
                if(map.get(nums[j])==0) map.remove(nums[j]) ;
                j++ ;
               }
          }
          return result  ;
    }
}