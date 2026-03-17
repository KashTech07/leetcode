class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list  = new ArrayList<>();
        backtrack(candidates , target , ans , list ,0);
        return ans ;
    }
    static void backtrack(int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> list , int index){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i = index ; i<candidates.length ; i++)
        if(target>=candidates[i]){
            list.add(candidates[i]);
            backtrack(candidates , target-candidates[i] , ans , list , i) ;
            list.remove(list.size()-1);
        }
    }
}