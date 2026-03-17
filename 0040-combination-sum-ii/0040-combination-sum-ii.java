class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(candidates) ;
       backtrack(candidates , target , ans , list ,  0 ) ;
       return ans ;
    }
    static void backtrack(int[] arr, int target ,  List<List<Integer>> ans , ArrayList<Integer> list , int index){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i = index ; i<arr.length ; i++){
            if(i>index && arr[i]==arr[i-1]) continue ;
            if(target>=arr[i]) {
                list.add(arr[i]);
                backtrack(arr , target-arr[i] , ans ,list , i+1);
                list.remove(list.size()-1);
            }
        }
    }
}