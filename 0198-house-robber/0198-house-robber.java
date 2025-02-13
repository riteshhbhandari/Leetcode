class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return rob(nums.length-1, nums, dp);

    }
    private static int rob(int ind, int[] nums, int[] dp){
        if(ind==0)
            return nums[ind];
        if(ind<=-1)
            return 0;
        if (dp[ind]!=-1)
        return dp[ind];
        int take=nums[ind]+ rob(ind-2, nums, dp);
        int notTake=0+rob(ind -1, nums, dp);
        return dp[ind]=Math.max(take, notTake);
    }
}