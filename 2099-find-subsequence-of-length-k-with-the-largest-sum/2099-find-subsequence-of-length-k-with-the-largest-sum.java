class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if(k==nums.length) return nums ;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->a-b) ;
        for(int n : nums){
            q.add(n) ;
            if(q.size()>k){
                q.poll() ;
            }
        }
        int[] ans = new int[k]; 
        int x = 0 ;
        for(int n : nums){
            if(q.contains(n)&&x<k) {
                ans[x++] = n ;
                q.remove(n) ;
            }
        }
        return ans ; }} 