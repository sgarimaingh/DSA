package DP;

public class LCS {
    private String s1 = "abcdaf", s2 = "acbcf";

    public int getMaxLength(){
        int n1=s1.length(), n2=s2.length();
        int dp[][] = new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1;
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }
}
