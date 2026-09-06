class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> q = new PriorityQueue<>((a,b)->{
            if(a.length()!=b.length()) return a.length()-b.length() ;
            else return a.compareTo(b)  ; }) ;
        for(String s : nums){
            q.add(s) ;
            if(q.size()>k){
                q.poll() ;
            }
        }
           return q.peek() ; }}  