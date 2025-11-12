// class Solution {
//     public long repairCars(int[] ranks, int cars) {
//     long start = 1;
//     long end = getMin(ranks)*cars*cars;
//     long ans = end;
//     while(start<=end){
//         long mid = start + (end - start)/2;
//         if(canGetRepair(ranks,mid,cars)){
//             ans = mid ;
//             end = mid -1 ;
//         }
//         else{
//             start = mid+1;
//         }
//     }   
//     return ans ; 
//     }
//     static boolean canGetRepair(int[] ranks , long time , int cars){
//         long count = 0 ;
//         for(int num : ranks){
//             count = count + (long)Math.sqrt((double)time/num);
//         }
//         if(count>=cars){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     static int getMin(int[] arr){
//         int min = arr[0];
//         for(int n: arr){
//             if(n<min){
//                 min = n ;
//             }
//         }
//         return min;
//     }
// }
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long start = 1L;
        long minRank = getMin(ranks);
        long end = minRank * (long)cars * (long)cars;
        long ans = end;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (canGetRepair(ranks, mid, cars)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    private boolean canGetRepair(int[] ranks, long time, int cars) {
        long count = 0L;
        for (int r : ranks) {
            long canFix = (long) Math.sqrt((double) time / r);
            count += canFix;
            if (count >= cars) {
                return true;
            }
        }
        return count >= cars;
    }

    private int getMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}
