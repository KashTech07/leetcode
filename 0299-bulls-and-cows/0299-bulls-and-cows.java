class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] counts = new int[10]; 

        for (int i = 0; i < secret.length(); i++) {
            char sChar = secret.charAt(i);
            char gChar = guess.charAt(i);

            if (sChar == gChar) {
                bulls++;
            } else {
                int sDigit = sChar - '0';
                int gDigit = gChar - '0';
                if (counts[sDigit] < 0) {
                    cows++;
                }
                if (counts[gDigit] > 0) {
                    cows++ ;}

                counts[sDigit]++;
                counts[gDigit]--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}