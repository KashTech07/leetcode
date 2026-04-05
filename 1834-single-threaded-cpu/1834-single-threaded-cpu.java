class triple{
    int a ;
    int b ; 
    int c ;
    triple(int a, int b , int c){
        this.a = a ;
        this.b= b ;
        this.c = c ;
    }
}


class Solution {
    public int[] getOrder(int[][] tasks) {
       triple[] arr = new triple[tasks.length] ;
       for(int i = 0 ; i< tasks.length  ; i++){
        arr[i] = new triple(tasks[i][0] , tasks[i][1] , i) ;
       } 
       Arrays.sort(arr , (x,y)-> x.a-y.a) ;
       PriorityQueue<triple> q =
    new PriorityQueue<>((x,y)-> x.b == y.b ? x.c - y.c : x.b - y.b);
       int time = 0 ;
       int i = 0 ;
       int k = 0;
       int[] ans = new int[arr.length] ;
       while(!q.isEmpty() || i<arr.length){
        if(q.isEmpty() && arr[i].a>time){
            time=arr[i].a ;
        }
        while(i<arr.length && arr[i].a<=time){
            q.add(arr[i]) ;
            i++ ;
        }
        triple t = q.poll() ;
        ans[k++] = t.c ;
        time += t.b ;
       }
       return ans ;}}

     