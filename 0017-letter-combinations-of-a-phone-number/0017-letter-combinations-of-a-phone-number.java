class Solution {
    static String[] str = {
        "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"
    } ;
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>() ;
        StringBuilder sb = new StringBuilder(); 
        solve(ans , digits , 0 , sb) ;
        return ans ;
    }
    static void solve(List<String> ans , String s , int idx , StringBuilder temp){
        if(idx==s.length()){
            ans.add(temp.toString()) ;
            return  ;
        }
        String s1 = str[s.charAt(idx)-'2'] ;
        for(int i = 0 ; i<s1.length() ; i++){
            temp.append(s1.charAt(i)) ;
            solve(ans,s,idx+1,temp) ;
            temp.deleteCharAt(temp.length()-1) ;
        }
    }
}