class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>() ;
        ArrayList<Integer > curr = new ArrayList<>() ;
        recurse(ans , curr , k , n , 1) ;
        return ans ;
    }
    static void recurse(List<List<Integer>> ans , ArrayList<Integer > curr , int k , int n , int idx ){
        if(n==0&&curr.size()==k){
            ans.add(new ArrayList<>(curr)) ;
            return ;
        }
        for(int i = idx ; i<=9 ; i++){
            if(n>=i){
                curr.add(i) ;
                recurse(ans , curr , k , n-i , i+1) ;
                curr.remove(curr.size()-1) ;
            }
        }
    }
}