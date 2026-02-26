class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int start = 1;
        int end = nums[0];
        int ans = 0 ;
        for(int i = 0 ;i<nums.length ; i++){
            if(nums[i]>end){
              end = nums[i];
            }
        }
        while(start<end){
            int mid = start + (end-start)/2 ;
            int opr = operations(nums , mid);
            if(opr<=maxOperations){
               end = mid ;
            }
            else{
             start = mid+1 ;
            }
        }
        return start ;
    }
    static int operations(int[] arr , int k ){
        int n = 0 ;
        for(int i = 0 ;i<arr.length ; i++){
            n+=(arr[i]-1)/k;
            // if(arr[i]%k!=0){
            //     n++;
            // }
        }
        return  n ;
    }
}