package DP.KnapSack01;

public class KnapSackGPT {
    public static int knapsack(int W, int[] weights, int[] values, int n) {
        if (n == 0 || W == 0) return 0; // Base case

        if (weights[n - 1] > W) // Cannot take this item
            return knapsack(W, weights, values, n - 1);

        // Either take the item or skip it
        return Math.max(
                values[n - 1] + knapsack(W - weights[n - 1], weights, values, n - 1),
                knapsack(W, weights, values, n - 1)
        );
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4};
        int[] values = {4, 5, 6};
        int W = 5;
        System.out.println("Max Value: " + knapsack(W, weights, values, weights.length)); // Output: 9
    }
}

