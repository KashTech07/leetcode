class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0 ;
        int count = 0;
        Arrays.sort(people) ;
        int right = people.length-1 ;
        while(left<=right){
            int capacity = limit - people[right] ;
            if(capacity>=people[left]){
               // count++ ;
                left++ ;
            }
            count++ ;
            right-- ;
        }
        return count ;
    }
}