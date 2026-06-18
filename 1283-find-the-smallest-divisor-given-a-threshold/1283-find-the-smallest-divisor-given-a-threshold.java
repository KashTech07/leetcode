class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
//         int start = 1 ;
//         int end = max(nums) ;
//         int ans = 0 ;
//         while(start<=end){
//             int mid = start + (end-start)/2 ;
//             if(canDone(nums , threshold , mid)){
//                 ans = mid ;
//                  end= mid-1 ;
                
//             }
//             else{
//                start = mid+1 ;
//             }
//         }
//         return ans ;
//     }
//     static boolean canDone(int[] nums, int threshold , int mid) {
//         int sum = 0 ;
//         for(int i = 0 ; i<nums.length ; i++){
//             if(nums[i]%mid!=0){
//                 sum+=(nums[i]/mid)+1 ;
//             }
//             else{
//                 sum+=nums[i]/mid ;
//             }
//         }
//         if(sum<=threshold) return true ;
//         return false ;
//     }
//     static int max(int[] arr){
//         int ans = arr[0] ;
//         for(int n : arr){
//             if(ans<n){
//                 ans = n ;
//             }
//         }
//         return ans ;
//     }
// }
    int start = 1 ; 
    int end = max(nums) ;
    int ans = 0;
    while(start<=end){
        int mid = start + (end-start)/2 ;
        if(canBeDone(nums , mid , threshold)){
            ans = mid  ;
            end = mid-1 ;
        }
        else{
            start = mid+1 ;
        }
    }
    return ans ;}
    static boolean canBeDone(int[] nums , int mid , int t){
        int sum = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]%mid!=0){
                sum+=(nums[i]/mid)+1 ;
            }
            else{
                sum+=nums[i]/mid ;
            }
        }
        return t>=sum ;
    }
    static int max(int[] arr){
        int ans = arr[0] ;
        for(int n : arr){
            if(ans<n){
                ans = n ;
            }
        }
        return ans ;
    }}