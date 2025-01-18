class Solution {
    public int climbStairs(int n) {
    //memoization
    //     int dp[]=new int [n+1];
    //     Arrays.fill(dp,-1);
    //      climbStairs(n, dp);
    //      return dp[n];
    // }
    // private static int climbStairs(int n, int dp[] ){
    //     if (n==0 || n==1){
    //         dp[n]=1;
    //         return 1;
    //     }
        
    //     if(dp[n]!=-1)
    //         return dp[n];

    //     return dp[n]=climbStairs(n-1, dp) + climbStairs(n-2, dp);
    // }

    //tabulation
    // int dp[]=new int [n+1];
    // dp[0]=dp[1]= 1;
    // for(int i=2;i<=n;i++)
    
    //     dp[i]=dp[i-1]+dp[i-2];
    // return dp[n];

    //space optimised approach Space complexity O(1)
    int prev= 1;
    int prev2=1;
    int curr=0;
    if (n==1 || n==0)
    return 1;
    for(int i=2;i<=n;i++){
        curr=prev+prev2;
        prev2=prev;
        prev=curr;
    }
    return curr;
    
}
}