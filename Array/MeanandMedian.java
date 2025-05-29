package Array;

import java.util.Arrays;

public class MeanandMedian {
     public static int median(int A[],int N)
    {
      
       Arrays.sort(A);
       int median=0;
       
       if (N % 2 != 0) { // Check if N is odd
        median = A[N / 2];
    } else {
        median = (A[N / 2 - 1] + A[N / 2]) / 2;
    }

       
       return median;
       
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public static int mean(int A[],int N)
    {
       //Your code here
       int sum=0;
       for(int i=0 ; i<N ;i++){
           
           sum = sum+A[i];
           
       }
       return sum/N;
    }

    public static void main(String[] args) {
        int a[] = {2,8,3,4};
        int n= a.length;

        System.out.println("mean "+mean(a, n));

        System.out.println("median "+median(a, n));
    }


}
