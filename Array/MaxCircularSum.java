package Array;

public class MaxCircularSum {

    public int maxCircularSum(int[] nums) {
        // Step 1: Find the maximum subarray sum (Kadane's algorithm)
        int maxKadane = kadane(nums);
        
        // Step 2: Calculate the total sum and the minimum subarray sum
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = -nums[i]; // Invert the array to find the minimum subarray sum
        }
        
        // Step 3: Find the minimum subarray sum (inverted Kadane's algorithm)
        int minKadane = kadane(nums);
        int maxCircular = totalSum + minKadane; // maxCircular = TotalSum - (-MinSum)
        
        // Step 4: Return the maximum of maxKadane and maxCircular
        // If all elements are negative, maxCircular would be 0, so handle that case
        if (maxCircular == 0) return maxKadane;
        return Math.max(maxKadane, maxCircular);
    }

    private int kadane(int arr[]){
        int maxsofar=arr[0];
        int currentMax=arr[0];

        for(int i=1;i<arr.length;i++){
            currentMax=Math.max(currentMax,currentMax+arr[i]);
            maxsofar=Math.max(currentMax, maxsofar);
        }
        return maxsofar;
    }
}
