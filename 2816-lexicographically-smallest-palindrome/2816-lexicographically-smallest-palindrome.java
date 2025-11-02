class Solution {
    public String makeSmallestPalindrome(String s) {
     int i=0;
     int j=s.length()-1;
     StringBuilder sb = new StringBuilder(s);
     while(i<j){
        char ci = s.charAt(i);
        char cj = s.charAt(j);
        char touse = ci<cj ? ci : cj ;
        sb.setCharAt(i,touse);
        sb.setCharAt(j,touse);
        i++;
        j--;
     }
     return sb.toString();}}