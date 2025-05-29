package DP;

import java.util.Arrays;

public class FibonacciDP {

    public static int fibDP(int n ,int dp[]){
        if(n<=1) //base case
        return n;

        if(dp[n] != -1)
        return dp[n];  // If already computed, return it
       
        int l = fibDP(n-1,dp);
        int r = fibDP(n-2,dp);
        int ans = l+r;
        dp[n] = ans; // Store computed value

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); // Initialize DP array with -1

        System.out.println("Fibonacci(" + n + ") = " + fibDP(n, dp)); // Output: 55
    }
}
