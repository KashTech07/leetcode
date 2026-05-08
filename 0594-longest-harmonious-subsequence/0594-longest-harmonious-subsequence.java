class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums) ;
        int j = 0 ;
        int ans = 0 ;
        for(int i = 1 ;i<nums.length ; i++){
             int diff = nums[i]-nums[j] ;
             while(diff>1){
                j++ ;
                diff = nums[i]-nums[j] ;
             }
             if(diff==1){
                ans =Math.max(ans , i-j+1) ;

             }
        }
        return ans ;
    }
}