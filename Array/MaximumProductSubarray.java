package Array;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // If current number is negative, swap max and min
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update max and min product ending at current index
            maxSoFar = Math.max(current, maxSoFar * current);
            minSoFar = Math.min(current, minSoFar * current);

            // Update global max product
            maxProduct = Math.max(maxProduct, maxSoFar);
        }

        return maxProduct;


}

    public static void main(String[] args) {
        int arr[] = {2, 3, -2, 4};
        System.out.print(maxProduct(arr));
    }
}
