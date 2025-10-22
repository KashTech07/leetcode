class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str="";
        int start=0;
        int count=0;
        int maxcount=0;
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
        if(!str.contains(String.valueOf(ch))){
            str=str+ch;
            count++;
        }
        else{
            int index=str.indexOf(ch);
            str=str.substring(1+index)+ch;
            count=str.length();
            }
            maxcount=Math.max(maxcount,count);
            }
            return maxcount;}}

        
       