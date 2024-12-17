class Solution {
    public static int func(int amount, int[] coins, int index, int[][] dp) {
        // Base Case: If amount is exactly 0, we found one valid combination
        if (amount == 0) {
            return 1;
        }

        // If the amount becomes negative, no valid combination
        if (amount < 0 || index >= coins.length) {
            return 0;
        }

        // If the result is already computed, return it
        if (dp[amount][index] != -1) {
            return dp[amount][index];
        }

        // Option 1: Include the current coin (keep 'index' unchanged)
        int include = func(amount - coins[index], coins, index, dp);

        // Option 2: Exclude the current coin (move to the next index)
        int exclude = func(amount, coins, index + 1, dp);

        // Store the result in dp and return
        dp[amount][index] = include + exclude;
        return dp[amount][index];
    }

    public int change(int amount, int[] coins) {
        if (amount == 0) {
            return 1; // Edge case: If the amount is 0, there's exactly 1 way
        }

        // Initialize dp array with -1 (uncomputed states)
        int[][] dp = new int[amount + 1][coins.length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Start the recursive function from index 0
        return func(amount, coins, 0, dp);
    }
}
