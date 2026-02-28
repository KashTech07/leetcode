class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       int start = min(bloomDay);
       int end = max(bloomDay); 
       int ans = -1 ;
       while(start<=end){
           int mid = start + (end-start)/2 ;
           if (BouquetMade(bloomDay , mid , m , k)){
            ans = mid ;
            end = mid-1 ;
           }
           else{
            start = mid+1 ;
           }
       }
       return ans ;
    }
    static boolean BouquetMade(int[] arr , int mid , int m , int k){
        int flower = 0;
        int bouquet = 0 ;
        for(int i = 0 ;i<arr.length ;i++){
            if(arr[i]<=mid){
                flower++;
            }
            else{flower = 0 ;}
            if(flower==k){
                bouquet++;
                flower = 0;
            }
        }
        if(bouquet>=m) return true ;
        return false;
    }
    static int max(int[] arr){
        int ans = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans ;
    }
     static int min(int[] arr){
        int ans = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans ;
    }
}