class Solution {

    public int jump(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return solve(nums, 0, dp);
    }

    static int solve(int[] nums, int idx, int[] dp) {

        if (idx >= nums.length - 1)
            return 0;

        if (dp[idx] != -1)
            return dp[idx];

        int ans = Integer.MAX_VALUE;

        for (int i = 1; i <= nums[idx]; i++) {

            if (idx + i < nums.length) {

                int a = solve(nums, idx + i, dp);

                if (a != Integer.MAX_VALUE)
                    ans = Math.min(ans, 1 + a);
            }
        }

        dp[idx] = ans;

        return ans;
    }
}