class Solution {
    public int longestOnes(int[] nums, int k) {
        int cz = 0;
        int count = 0;
        int j = 0;
        for(int i = 0 ;i<nums.length ; i++){
            if(nums[i]==0) cz++ ;
            while(cz>k){
                if(nums[j]==0) cz-- ;
                j++ ;
            }
            count = Math.max(count , i-j+1);
        }
        return count ;
    }
}