class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[] dp = new int[target+1] ;
        Arrays.fill(dp , -1) ;
         dp[0] = 0 ;
        for(int i = 0 ; i <nums.size() ; i++){
            for(int j = target ; j>=nums.get(i) ; j--){
                if(dp[j-nums.get(i)]!=-1){
                    dp[j] = Math.max(dp[j] , dp[j-nums.get(i)]+1) ;
                }
            }
        }
        return dp[target] ;
    }
}