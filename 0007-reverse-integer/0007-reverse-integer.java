class Solution {
    public int reverse(int x) {
       
long rev = 0; // Use long to check for overflow
    while (x != 0) {
      int r = x % 10;
      rev = rev * 10 + r;
      x = x / 10;
    }
    if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
      return 0; // Return 0 if overflow occurs
    }
    return (int) rev;
  }
}