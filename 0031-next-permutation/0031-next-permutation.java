class Solution {
    public void nextPermutation(int[] nums) {
        int fbp = -1 ;
        int sbp = -1 ;
        //int i = nums.length-1 ;
        for(int i = nums.length-2 ; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                fbp = i ;
                break ;
            }
        }
        if(fbp==-1){
            reverse(nums,0,nums.length-1) ;
            return ;
        }
        for (int i = nums.length - 1; i > fbp; i--) {
            if (nums[i] > nums[fbp]) {
                swap(nums, i, fbp);
                break;
            }
        }
        reverse(nums , fbp+1 , nums.length - 1) ;
    }
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Helper to swap
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
       