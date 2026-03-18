class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums , ans , curr , used ) ;
        return ans ;
    }
    static void backtrack(int[] arr , List<List<Integer>> ans  ,  ArrayList<Integer> curr , boolean[] used ){
        if(curr.size()==arr.length){
            ans.add(new ArrayList<>(curr));
            return  ;
        }
        for(int i = 0 ;i<arr.length ; i++){
            if(used[i]==true) continue ;
            used[i]=true ;
            curr.add(arr[i]) ;
            backtrack(arr , ans , curr , used);
            curr.remove(curr.size()-1) ;
            used[i]=false ;
        }
    }
}