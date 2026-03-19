class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums , goal)-atMost(nums , goal-1) ;
    }
    static int atMost(int[] arr , int k){
        if(k<0) return 0 ;
        int  j = 0 ;
        int count = 0 ;
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum+=arr[i] ;
            while(sum>k&&j<arr.length){
                sum-=arr[j] ;
                j++ ;
            }
            count = count+i-j+1 ;
        }
        return count ;
    }
}