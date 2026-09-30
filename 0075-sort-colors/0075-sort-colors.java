class Solution {
    public void sortColors(int[] nums) {
//         int start = 0 ;
//         int mid = 0 ;
//         int end = nums.length-1 ;
//        while(mid<=end){
//            if(nums[mid]==2){
//             int t = nums[mid] ;
//             nums[mid]=nums[end] ;
//             nums[end] = t ;
//             end-- ;
//            }
//            else if(nums[mid]==0){
//             int t = nums[mid] ;
//             nums[mid]=nums[start] ;
//             nums[start] =t ;
//             start ++ ;
//              mid++ ;
//            }
//            else mid++ ;
          
//         }
    
    
// }}
int high = nums.length-1 ;
int low = 0 ; 
int mid = 0 ; 
while(high>=mid){
    if(nums[mid]==0){
        swap(nums , mid, low) ;
        low++ ;
        mid++ ;
    }
    else if(nums[mid]==2){
        swap(nums , mid , high) ;
        high-- ;
    }
    else{
        mid++ ;
    }
} 
 }
static void swap(int[] arr , int a , int b){
    int t = arr[a] ;
    arr[a] = arr[b] ;
    arr[b] = t ;
}
}