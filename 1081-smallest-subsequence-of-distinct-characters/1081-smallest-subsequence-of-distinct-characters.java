class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26] ;
    for(char c : s.toCharArray()){
        freq[c-'a']++ ;
    }
    boolean[] visited = new boolean[26] ;
    Stack<Character> st = new Stack<>() ;
    StringBuilder sb = new StringBuilder() ;
    for(int i = 0 ; i<s.length() ; i++){
        char c = s.charAt(i) ;
        freq[c-'a']-- ;
        if(visited[c-'a']){
          continue ;
        }
        while(!st.isEmpty() && st.peek()>c && freq[st.peek()-'a']>0){
         visited[st.pop() - 'a'] = false;
            }

            st.push(c);
            visited[c - 'a'] = true;
        }


        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}