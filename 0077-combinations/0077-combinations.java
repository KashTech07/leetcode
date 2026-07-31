class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> curr = new ArrayList<>() ;
        fill(ans , curr ,1, n , k) ;
        return ans ;
    }
    static void fill( List<List<Integer>> ans ,  List<Integer> curr , int idx ,int n , int k){
        if(curr.size()==k){
          ans.add(new ArrayList<>(curr)) ;
          return ;
        }
        for(int i = idx ; i<=n ; i++){
        curr.add(i) ;
        fill(ans , curr , i+1 , n, k);
        curr.remove(curr.size()-1) ;
    }
}}