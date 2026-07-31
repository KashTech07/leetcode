class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums) ;
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> curr = new ArrayList<>() ;
        fill(ans , curr , nums , 0) ;
        return ans ;
    }
    static void fill(List<List<Integer>> ans , List<Integer> curr , int[] nums , int index ){
        if(index==nums.length){
            if(!ans.contains(new ArrayList<>(curr)))
            ans.add(new ArrayList<>(curr)) ;
            return ;
        }
        curr.add(nums[index]) ;
        fill(ans , curr , nums , index+1) ;
        curr.remove(curr.size()-1) ;
        fill(ans , curr , nums , index+1) ;
    }
}