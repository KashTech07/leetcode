class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position) ;
        int start = 1 ;
        int end = position[position.length-1]-position[0] ;
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(can(position , m , mid)){
                ans = mid ;
               start = mid+1 ;
            }
            else{
                end = mid-1 ;
            }
        }
        return ans ;
    }
    static boolean can(int[] arr , int m , int mid){
        int c = 1 ;
        int lastpos = arr[0] ;
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]-lastpos>=mid){
                c++ ;
                lastpos = arr[i] ;
            }        
            }
            return c>=m ;
    }
}