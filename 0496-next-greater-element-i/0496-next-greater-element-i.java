class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int[] ans = new int[nums1.length]  ;
      Stack<Integer> s = new Stack<>();
      for(int num : nums2){
       while(!s.isEmpty()&&num>s.peek()){
        map.put(s.pop(),num);
       }
       s.push(num);
      }
      while(!s.empty()){
        map.put(s.pop(),-1);
      }
      for(int i = 0 ;i<nums1.length ; i++){
        ans[i]=map.get(nums1[i]);
      }
      return ans;
    }
}