import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {
        // Step 1: Find the doctor's limit (n / 2)
        int maxCandiesAliceCanEat = candyType.length / 2;
        
        // Step 2: Count the unique types of candies using a HashSet
        HashSet<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
            
            // Optimization: If unique types already reach or exceed the doctor's limit, 
            // we can stop early because the answer cannot exceed maxCandiesAliceCanEat.
            if (uniqueCandies.size() >= maxCandiesAliceCanEat) {
                return maxCandiesAliceCanEat;
            }
        }
        
        // Step 3: Return the smaller of the two limits
        return uniqueCandies.size();
    }
}