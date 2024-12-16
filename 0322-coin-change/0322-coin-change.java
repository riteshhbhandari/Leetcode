class Solution {
    public static int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;

        int fi=min(coins, amount, dp);
        System.out.println(dp.length);
        for(int x:dp)
        System.out.println(x);

        if(fi==Integer.MAX_VALUE)
        return-1;
        
        return fi;
    }
    public static int min(int[] coins, int amount,int dp[] ){
        if(coins.length==1 && coins[0]<amount){
            if(amount%coins[0]!=0)
            return -1;}
        if(amount==0)
            return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amount-coins[i]>=0){
                int subAns=0;
                if(dp[amount-coins[i]]!=-1)
                subAns=dp[amount-coins[i]];
                else
                subAns= min(coins,(amount-coins[i]),dp);
                
                if(subAns !=Integer.MAX_VALUE && subAns +1 < ans)
                    ans=subAns+1;
            
            }
        }
        // if(ans!=Integer.MAX_VALUE)
        dp[amount]=ans;
        // else
        // dp[amount]=-1;
        return ans;
    }
}