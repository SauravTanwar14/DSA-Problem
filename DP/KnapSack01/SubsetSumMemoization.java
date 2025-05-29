package DP.KnapSack01;

public class SubsetSumMemoization {
    static Boolean[][] dp;
    public static boolean subsetSum(int arr[],int n,int sum){
        if(n==0 || sum==0){
            return true;
        }
        if(dp[n][sum] != null){
            return dp[n][sum];
        }

        if(arr[n-1]>sum){
            dp[n][sum] = subsetSum(arr,n-1,sum);
            return dp[n][sum];
        }

        dp[n][sum] = subsetSum(arr,n-1,sum) || subsetSum(arr,n-1,sum-arr[n-1]);
        return dp[n][sum];
    }

    public static boolean subsetSum(int[] nums, int S) {
        int n = nums.length;
        dp = new Boolean[n + 1][S + 1]; // Initialize DP table
        return subsetSum(nums, n, S);
    }

    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int S = 9;
        System.out.println("Subset exists: " + subsetSum(nums, S));
    }
}
