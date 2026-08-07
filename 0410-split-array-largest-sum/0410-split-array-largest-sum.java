class Solution {
    public int splitArray(int[] nums, int k) {
//         int start  = max(nums);
//         int end = sum(nums);
//         int ans = 0;
//         while(start<=end){
//             int mid = start + (end-start)/2 ;
//             if(canBeSplitted(nums,mid,k)){
//                 ans  = mid ;
//                 end = mid-1 ;
//             }
//             else{
//                 start = mid+1 ;
//             }
//         }
//         return ans ;
//     }
//     static boolean canBeSplitted(int[] arr , int mid , int k){
//         int sa = 1 ;
//         int sum = 0 ;
//         for(int i = 0 ; i<arr.length ; i++){
//             if(sum+arr[i]>mid){
//                 sa++ ; 
//                 sum = arr[i];
//             }
//             else{
//                 sum+=arr[i];
//             }
//         }
//         if(sa<=k) return true ;
//         return false;
//     }
//     static int max(int[] arr){
//         int ans = arr[0];
//         for(int n : arr){            
//                if(n>ans){
//                 ans= n ;
//             }}
//             return ans ;
//     }
//     static int sum(int[] arr){
//         int ans = 0;
//         for(int n : arr){            
               
//                 ans += n ;
//             }
//             return ans ;
//     }
// }
int n = nums.length ;
int[][] dp = new int[n+1][k+1] ;
if(k>n) return -1 ;
for(int[] r : dp){
    Arrays.fill(r , -1) ;
}
return solve(nums , 0 , n , k , dp) ;}
static int solve(int[] arr , int idx , int n , int k , int[][] dp){
    if(dp[idx][k]!=-1) return dp[idx][k] ;
    if(k==0) return 0 ;
    if(k==1){
        int sum = 0 ;
        for(int i=idx ; i<n ; i++){
            sum+=arr[i] ;
        }
        return sum ;
    }
    int sum = 0 ;
    int finaln = Integer.MAX_VALUE ;
    for(int i = idx ; i<=n-k ; i++){
       sum+=arr[i] ;
       int result = Math.max(sum , solve(arr , i+1 , n , k-1 , dp)) ;
       finaln = Math.min(result , finaln) ;
    }
    return dp[idx][k] = finaln ;
}}