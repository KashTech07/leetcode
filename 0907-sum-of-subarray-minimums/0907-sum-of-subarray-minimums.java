class Solution {
    public int sumSubarrayMins(int[] arr) {
       Stack<Integer> s = new Stack<>();
       int[] left =  new int[arr.length];
       int[] right = new int[arr.length];
       int MOD = 1000000007;
       for(int i = 0; i<arr.length ; i++){
        while(!s.isEmpty()&& arr[s.peek()] >= arr[i]){
            s.pop();
        }
        left[i]= s.isEmpty() ? i+1 : i-s.peek();
        s.push(i);
       } 
       s.clear();
       for(int i=arr.length-1 ; i>=0 ; i--){
        while(!s.isEmpty()&& arr[s.peek()]>arr[i]){
            s.pop();
        }
        right[i] = s.isEmpty()? arr.length-i : s.peek()-i ;
        s.push(i);
       }
       long sum =0;
       for(int i=0 ; i<arr.length ; i++){
        // sum+=(arr[i]*left[i]*right[i])%MOD;
        long contri =(long) arr[i]*left[i]*right[i];
        sum= (sum+contri)%MOD;
       }
       return (int)sum ;
    }
}