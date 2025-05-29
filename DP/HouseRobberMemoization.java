package DP;

import java.util.Arrays;

public class HouseRobberMemoization {
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robHelper(nums, 0, dp);
    }

    private static int robHelper(int[] nums, int i, int[] dp) {
        if (i >= nums.length) return 0;
        if (dp[i] != -1) return dp[i]; // Return cached result
        dp[i] = Math.max(nums[i] + robHelper(nums, i + 2, dp), robHelper(nums, i + 1, dp));
        return dp[i];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums)); // Output: 12
    }
}

