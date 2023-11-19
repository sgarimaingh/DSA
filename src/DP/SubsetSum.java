package DP;

public class SubsetSum {

    private int[] a = {3,7,8,10};
    private int sum = 11;

    boolean isSubsetPresent(){
        int n = a.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0||j==0)dp[i][j]=true;
                else if(j<a[i-1]) dp[i][j]=dp[i-1][j];
                else{
                    dp[i][j]= dp[i-1][j] || dp[i-1][j-a[i-1]];
                }

            }
        }
        return dp[n][sum];

    }


}
