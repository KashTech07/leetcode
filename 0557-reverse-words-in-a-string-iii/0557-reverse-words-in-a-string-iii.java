class Solution {
    public String reverseWords(String s) {
      String[] words=s.split(" ");
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<words.length;i++){
        int l=0;
        int r=words[i].length()-1;
        char[] ch=words[i].toCharArray();
        while(l<r){
           char temp= ch[l];
           ch[l]=ch[r];
           ch[r]=temp;
           l++;
           r--;
        }
        sb.append(new String(ch));
        if(i<words.length-1){
            sb.append(" ");
        }

      }
      return sb.toString();  
    }
}