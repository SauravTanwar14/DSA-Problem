package Array;

import java.util.Arrays;

public class MinimizeHeightDifference {

    public static int minimizeDifference(int[] arr, int k){

        int n=arr.length;
        Arrays.sort(arr);

        //initial result as we sort the array we know max difference substracting first element form last element
        int result=arr[n-1]-arr[0];

        int smallest = arr[0]+k;// Minimum height after increasing the smallest tower.
        int largest = arr[n-1]-k; // Maximum height after decreasing the largest tower.

        for(int i=0;i<arr.length-1;i++){

            int minHeight = Math.min(smallest, arr[i+1]-k);
            int maxHeight = Math.max(largest, arr[i]+k);

             // Update result with the smallest difference.
             result = Math.min(result, maxHeight - minHeight);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 15, 10};
        int k = 6;
        System.out.println("Minimum Difference: " + minimizeDifference(arr, k)); // Output: 5
    }
}
