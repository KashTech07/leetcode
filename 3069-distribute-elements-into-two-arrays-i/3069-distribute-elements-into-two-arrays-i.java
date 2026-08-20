class Solution {
    public int[] resultArray(int[] nums) {
        int[] ans = new int[nums.length] ;
        ArrayList<Integer> list1 = new ArrayList<>() ;
        ArrayList<Integer> list2 = new ArrayList<>() ;
        list1.add(nums[0]) ;
        int x = 0 ;
        list2.add(nums[1]) ;
        for(int i = 2 ; i<nums.length ; i++){
            if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
                list1.add(nums[i]) ;
            }
            else{
                list2.add(nums[i]) ;
            }
        }
        for(int i : list2){
            list1.add(i) ;
        }
        for(int n : list1){
            ans[x++] = n ;
        }
        return ans ;
    }
}