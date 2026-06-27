class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>() ;
        for(String  s: wordList ){
            set.add(s) ;
        }
       // if(beginWord.equals(endWord)) return 0 ;
        if(!set.contains(endWord)) return 0 ;
        int level = 1 ; 
        Queue<String> q = new LinkedList<>() ;
        q.add(beginWord) ;
        while(!q.isEmpty()){
            int size = q.size() ;
            for(int j = 0 ; j<size ; j++){
                String currentWord = q.poll() ;
                if(currentWord.equals(endWord)) return level ;
                char[] arr = currentWord.toCharArray() ;
                for(int k = 0 ; k<arr.length ; k++){
                  char org = arr[k] ;
                  for(char c = 'a' ; c<='z' ; c++){
                    if(c==org) continue ;
                    arr[k]=c ;
                    String newWord = String.valueOf(arr) ;
                    if(set.contains(newWord)){
                        q.add(newWord) ;
                        set.remove(newWord) ;
                    }
                  }
                  arr[k] = org ;

                }
            }
            level++ ;
        }
        return 0 ;
    }
}