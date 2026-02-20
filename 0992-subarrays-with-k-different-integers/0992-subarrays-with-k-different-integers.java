class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums , k-1);
    }
    static int helper(int[] arr , int k){
        int c = 0;
        int j = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ;i<arr.length ; i++){
            int a = arr[i];
            map.put(a,map.getOrDefault(a,0)+1);
            while(map.size()>k){
                map.put(arr[j] , map.get(arr[j])-1);
                if(map.get(arr[j])==0) map.remove(arr[j]);
                j++ ;
            }
            c+=i-j+1 ;

        }
        return c ;
    }}
