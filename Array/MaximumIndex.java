package Array;

//Given an array a of n positive integers. 
//The task is to find the maximum of j - i subjected to the constraint of a[i] < a[j] and i < j.

public class MaximumIndex {

    // navie solution
    /* public static int maxIndexDiff(int arr[], int n) {

        int maxdiff = 0;

        for (int i = 0; i < n; i++) {
            int diff = 0;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {

                    diff = j - i;
                }

            }

            if (maxdiff < diff) {
                maxdiff = diff;
            }

        }

        return maxdiff;

    } */

    public static int maxIndexDiff(int arr[],int n){

        int maxDiff = -1;

        //int i, j;
        
        int min[] = new int[n];

        int max[] = new int[n];


       //for finding minimum element in array
       min[0] = arr[0];
        for(int i = 1 ;i< n ; i++){
             min[i] = Math.min(arr[i], min[i-1]);
        }

        //for finding maximum element in array
        max[n-1] = arr[n-1];
        for(int i = n-2 ;i>=0; i--){
            max[i] = Math.max(arr[i], max[i+1]);
       }

       int i = 0;
      int j = 0;
       while (j < n && i < n) {
           if (min[i] <= max[j]) {
               maxDiff = Math.max(maxDiff, j - i);
               j++;
           } else {
               i++;
           }
       }

       return maxDiff;
    }

    public static void main(String[] args) {
        int arr[] = {1,15};

        int n = arr.length;

        System.out.println("result" + maxIndexDiff(arr, n));
    }

}
