class Solution {
    public int lengthOfLongestSubstring(String s) {
        // String str="";
        //  int start=0;
        //  int count=0;
        //  int maxcount=0;
        //  for(int end=0;end<s.length();end++){
        //      char ch=s.charAt(end);
        //  if(!str.contains(String.valueOf(ch))){
        //      str=str+ch;
        //      count++;
        //  }
        //  else{
        //      int index=str.indexOf(ch);
        //      str=str.substring(1+index)+ch;
        //      count=str.length();
        //     }
        //     maxcount=Math.max(maxcount,count);
        //     }
        //     return maxcount;}}

        
       ArrayList<Character> list = new ArrayList<>();
       int j = 0 ;
       int max=0;
       if(s.length()==0) return 0;
       if(s.length()==1) return 1;
       for(int i=0 ; i<s.length() ; i++){
        char c = s.charAt(i);
        while(list.contains(c)){
            max=Math.max(max,list.size());
            list.remove(0);
            // j++;
       }
       list.add(c);
       max=Math.max(max,list.size());}
       return max;}}