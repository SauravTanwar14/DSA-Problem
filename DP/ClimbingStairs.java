package DP;

import java.util.Arrays;

public class ClimbingStairs {

    //Optimized Bottom-Up DP (Tabulation)
    public static int countWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        int dp[] = new int[n+1];

        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    // Using Memoization (Top-Down DP)
    public static int climbingStairsMemoization(int n,int dp[]){
        if (n == 0 || n == 1) return 1; // Base cases

        if (dp[n] != -1) return dp[n]; // Return cached value

        int left = climbingStairsMemoization(n - 1, dp);
        int right = climbingStairsMemoization(n - 2, dp);
        dp[n] = left + right; // Store result in dp table

        return dp[n];
    }

    // Using Memoization (Top-Down DP)
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); // Initialize dp array with -1
        return climbingStairsMemoization(n, dp);
    }

    // pace-Optimized Approach (O(1))
    public static int climbingStairsOptimized(int n){
        if (n == 0 || n == 1) return 1;

        int prev2 = 1, prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Ways to climb " + n + " stairs: " + countWays(n));
        System.out.println("Ways to climb " + n + " stairs: " + climbStairs(n));
        System.out.println("Ways to climb " + n + " stairs: " + climbingStairsOptimized(n));
    }
}
