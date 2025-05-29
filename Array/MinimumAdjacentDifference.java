package Array;

public class MinimumAdjacentDifference {

    static int minDiff(int arr[],int n){

        if (n < 2) {
            // If there are less than 2 elements, return 0 as there's no adjacent difference to calculate
            return 0;
        }

        int diff;
        int res = Math.abs(arr[n-1] - arr[0]);

        for (int i = 1; i < n; i++) {
            diff = Math.abs(arr[i - 1] - arr[i]);
            res = Math.min(res, diff);
        }

        return res;
    }

    public static void main(String[] args) {
        
       // int arr[] = {8,-8,9,-9,10,-11,12};
       int arr[] = {10,-3,-4,7,6,5,-4,-1};

        int n = arr.length;

        System.out.println("result "+ minDiff(arr, n));
    }

}
