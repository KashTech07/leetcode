class Solution {
    public List<Integer> lexicalOrder(int n) {
       String[] arr = new String[n];
       arr = recur(arr , n , 0);
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<arr.length;i++){
        list.add(Integer.valueOf(arr[i]));
       }
       return list;}


       static String[] recur(String[] arr , int n , int i){
        if(i==n){
         Arrays.sort(arr);
         return arr;
        }
        arr[i]=String.valueOf(i+1);
        return recur(arr , n ,i+1);
       }}