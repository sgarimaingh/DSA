package DP;

public class LongestPalindromicSubSequence {

    private String S = "BBABCBCABAC";

    public int getLength(){
        int n= S.length();
        String R = String.valueOf(new StringBuilder(S).reverse());
        int [][] dp = new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(S.charAt(i-1)==R.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}