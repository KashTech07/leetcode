// class Solution {
//     public int trap(int[] height) {
//         if (height == null || height.length == 0) {
//             return 0;
//         }
//         int ans = 0;
//       for(int i =0;i<height.length;i++){
//         int a = max(height,0,i);
//         int b = max(height,i,height.length);
//         int min = Math.min(a,b);
//         if(min>height[i]){
//             ans = ans + (min-height[i]);
//         }
//       }
//       return ans;  
//     }
//     static int max(int[] arr , int start , int end){
//         int max = arr[start];
//         for(int i = start+1 ; i<end ; i++){
//             if(max<arr[i]){
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
// }
// class Solution {
//     public int trap(int[] height) {
//         if (height == null || height.length == 0) {
//             return 0;
//         }
//         int ans = 0;
//         int n = height.length;

//         for (int i = 0; i < n; i++) {
//             int leftMax  = findMax(height, 0, i);
//             int rightMax = findMax(height, i, n - 1);

//             int minOfTwo = Math.min(leftMax, rightMax);
//             if (minOfTwo > height[i]) {
//                 ans += (minOfTwo - height[i]);
//             }
//         }

//         return ans;
//     }

//     private static int findMax(int[] arr, int start, int end) {
//         int m = arr[start];
//         for (int i = start + 1; i <= end; i++) {
//             if (arr[i] > m) {
//                 m = arr[i];
//             }
//         }
//         return m;
//     }
// }
// Approach 3: Two-Pointer Approach (O(N) Time, O(1) Space)
class Solution {
    public int trap(int[] arr) {
        int l = 0, r = arr.length - 1;
        int lmax = 0, rmax = 0, ans = 0;

        while (l < r) {
            lmax = Math.max(lmax, arr[l]);
            rmax = Math.max(rmax, arr[r]);

            if (lmax < rmax) {
                ans += lmax - arr[l];
                l++;
            } else {
                ans += rmax - arr[r];
                r--;
            }
        }
        return ans;
    }
}