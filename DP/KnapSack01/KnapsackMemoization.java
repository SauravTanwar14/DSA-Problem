package DP.KnapSack01;

import java.util.Arrays;

public class KnapsackMemoization {

    static int dp[][];

    public static int knapsack(int W, int [] weights,int [] values,int n){
        if(n==0 || W==0){
            return 0;
        }

        if(dp[n][W] != -1)
            return dp[n][W];

        if(weights[n-1]> W){
            return dp[n][W] = knapsack(W,weights,values,n-1);
        }

        return dp[n][W] = Math.max(
                values[n - 1] + knapsack(W - weights[n - 1], weights, values, n - 1),
                knapsack(W, weights, values, n - 1)
        );
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4};
        int[] values = {4, 5, 6};
        int W = 5;
        int n = weights.length;

        dp = new int[n + 1][W + 1];
        for (int[] row : dp) Arrays.fill(row, -1); // Initialize DP table

        System.out.println("Max Value: " + knapsack(W, weights, values, n));
    }// Output: 9
}
