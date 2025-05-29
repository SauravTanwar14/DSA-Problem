package Array;

public class Arrange {

    // static void arrange(long arr[], int n)
    // {
    //     // your code here
    
    //      n = arr.length;

    //      long temp[] = new long[arr.length];

    //      temp[0] = arr[n-1];

    //     for(int i =1 ;i<n ;i++){

    //         temp[i]= arr[i-1];
            
    //     }

    //     for(int i =0 ;i<n ;i++){
    //         System.out.print(temp[i]+" ");
    //     }
    static void arrange(long arr[], int n){

        for (int i = 0; i < n; i++) {
            // Store both old and new values at the same index
            arr[i] = arr[i] + (arr[(int)arr[i]] % n) * n;
        }

        // Second step: Decode the new values from the array
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }

    }

    
    
    public static void main(String[] args) {
        long arr[] = {4,0,2,1,3};
        //long arr[] = {1,0};

        int n = arr.length;

        arrange(arr,n);

         // Print the rearranged array
         for (long num : arr) {
            System.out.print(num + " ");
        }
    }
}
