class Solution {
    public int climbStairs(int n) {
        int dp[]=new int [n+1];
        Arrays.fill(dp,-1);
         climbStairs(n, dp);
         return dp[n];
    }
    private static int climbStairs(int n, int dp[] ){
        if (n==0 || n==1){
            dp[n]=1;
            return 1;
        }
        
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]=climbStairs(n-1, dp) + climbStairs(n-2, dp);
    }
}