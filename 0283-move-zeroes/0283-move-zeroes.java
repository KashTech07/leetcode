class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0 ; 
       int j = 0 ;
       while(i<nums.length && j<nums.length){
        while(i<nums.length&&nums[i]!=0){
            i++ ;
        }
        if (j <= i) {
                j = i + 1;
            }
        while(j<nums.length&&nums[j]==0){
            j++ ;
        }
        if (i < nums.length && j < nums.length)
        swap(nums ,i,j ) ;
       }}
       static void swap(int[] arr , int a, int b){
        int t = arr[a] ;
        arr[a] =arr[b] ;
        arr[b]=t ;
       }}