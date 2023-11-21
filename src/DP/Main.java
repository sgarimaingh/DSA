package DP;



public class Main {
    public static void main(String[] args) {

        // 0/1  knapsack
        ZeroOneKnapsack z = new ZeroOneKnapsack();
        System.out.println("Maximum price is : " + z.getMaximumPrice());

        // LCS
        LCS l = new LCS();
        System.out.println("Maximum length of LCS is: " + l.getMaxLength());

        // Subset Sum
        SubsetSum s = new SubsetSum();
        System.out.println("Is Subset present with given sum: " + s.isSubsetPresent());

        // Minimum edit distance
        MinimumEditDistance m = new MinimumEditDistance();
        System.out.println("Minimum operations needed are: " + m.getMinOperations());

        // Minimum coins
       CoinChanging c = new CoinChanging();
        System.out.println("Minimum coins needed are: " + c.getMinCoins());

    }
}
