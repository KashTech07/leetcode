class Solution {
    public int[] nextGreaterElements(int[] nums) {
      Stack<Integer> s = new Stack<>();
      int[] ans = new int[nums.length];
      Arrays.fill(ans,-1);
      for(int i =0 ;i<nums.length*2;i++){
        int num = nums[i%nums.length];
        while(!s.isEmpty()&&num>nums[s.peek()]){
            ans[s.pop()]=num;
        }
        if(i<nums.length){
        s.push(i);
      }}
      return ans;
        
    }
}