package DP;

public class MCM {

    private int[] arr = {2,3,6,4,5};

    int getMinCost(){
        int n= arr.length,q;
        int dp[][] = new int[n][n];

        for(int l=2;l<n;l++){
            for(int i=0;i<n-l;i++){
                int j=i+l;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    q = dp[i][k] + dp[k][j] + arr[i]*arr[k]*arr[j];
                    dp[i][j]=Math.min(q,dp[i][j]);
                }
            }
        }
        return dp[0][n-1];
    }
}
