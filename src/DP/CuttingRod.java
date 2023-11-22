package DP;

public class CuttingRod {

    private int[] p ={ 1, 5, 8, 9, 10, 17, 17, 20 };

    int getMaxProfit(){
        int n= p.length;
        int dp[][]=new int[n+1][n+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0) dp[i][j]=0;
                else if (i == 1) {
                    dp[i][j] = j * p[i - 1];
                }
                else if(j<i) dp[i][j]=dp[i-1][j];
                else {
                    dp[i][j]=Math.max(dp[i-1][j],p[i-1]+dp[i][j-i]);
                }
            }
        }
        return dp[n][n];

    }
}
