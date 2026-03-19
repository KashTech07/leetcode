class Solution {
    public List<String> validStrings(int n) {
       List<String> curr = new ArrayList<>() ;
       generate(n , curr , "" );
       return curr ; 
    }
    static void generate(int n , List<String> curr , String ans){
        if(ans.length()==n){
            curr.add(ans) ;
            return ;
        }
        generate(n , curr , ans+"1") ;
        if(ans.length()==0||ans.charAt(ans.length()-1)!='0'){
            generate(n , curr , ans+"0");
        }
    }
}