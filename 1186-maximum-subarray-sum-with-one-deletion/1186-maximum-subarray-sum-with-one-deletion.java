class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];
        int v3 = 0;
        for(int i = 1 ;i<arr.length ; i++){
            int v1 = nodelete ;
            int v2 = onedelete ;
            nodelete = Math.max(nodelete+arr[i] , arr[i]);
            if(v2==Integer.MIN_VALUE){
                 v3 = arr[i];
            }else {
                v3 = v2+arr[i];
            }
            onedelete = Math.max(v3, v1);
            res = Math.max(Math.max(nodelete , onedelete),res);
        }
        return res ;
    }
}