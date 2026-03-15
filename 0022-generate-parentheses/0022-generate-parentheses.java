class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder s= new StringBuilder();
        generate(0 , 0 , list , s , n);
        return list ;
    }
    static void generate(int open , int close , ArrayList<String> list , StringBuilder sb , int n){
        if(open==n&&close==n){
            list.add(sb.toString());
            return  ;
        }
        if(open<n){
            sb.append("(");
            generate(open+1 , close , list , sb , n);
           sb.deleteCharAt(sb.length() - 1);
        }
        if(close<open){
            sb.append(")");
            generate(open , close+1 , list , sb , n);
            sb.deleteCharAt(sb.length()-1);
        }
        return  ;
    }
}