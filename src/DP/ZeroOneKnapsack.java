package DP;

public class ZeroOneKnapsack {

    private int[] weights = {1,3,4,5};
    private int[] prices = {1,4,5,7};
    private int target = 7;

    public int getMaximumPrice(){
        int n = weights.length;
        int dp[][]= new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=target;j++){
                if(i==0 || j==0) dp[i][j]=0;
                else if(weights[i-1]>j) dp[i][j]= dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j], prices[i-1]+dp[i-1][j-weights[i-1]]);
                }
            }
        }
        return dp[n][target];

    }
}

