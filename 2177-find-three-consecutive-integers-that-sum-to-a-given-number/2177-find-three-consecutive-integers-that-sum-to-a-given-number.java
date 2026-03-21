class Solution {
    public long[] sumOfThree(long num) {
        long r = num%3 ; 
        long[] ans = new long[3];
        if(r==0){
            long n = num/3 ;
            ans[0] = n-1 ;
            ans[1] = n;
            ans[2] = n+1 ;
        }
        else return new long[0] ;
        return ans ;
    }
    }
