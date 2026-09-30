class Solution {
    public int minimumMoves(String s) {
         int step = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'X') {
                step++;
                i += 2;
            }
        }

        return step;
    }
}
    