package DP;

public class CoinChanging {
    private int[] coins = {3,4,6,7,9};
    private int target = 15;

    public int getMinCoins(){
        int n = coins.length;
        int dp[][] = new int[n+1][target+1];

        for(int i=0; i <= n; i++){
            dp[i][0] = 1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(j<coins[i-1]) dp[i][j]=dp[i-1][j];
                else{
                    dp[i][j]= Math.min(dp[i-1][j]+1, 1+dp[i-1][j-coins[i-1]]);
                }
            }
        }
        return dp[n][target];


    }


}
