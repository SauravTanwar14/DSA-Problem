package Graph;

import java.util.ArrayList;

public class Test {

    public static void selectionSort(int arr[]){

       int n = arr.length;

       //finding minimum element of the array
       for(int i=0;i<n;i++){
           int minIndex =i;

           for(int j=i+1;j<n;j++){
               if(arr[j]<arr[minIndex])
                   minIndex = j;
           }

           //swap the minimum element
           if(minIndex!=i){
               int temp = arr[i];
               arr[i] = arr[minIndex];
               arr[minIndex] = temp;
           }
       }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Helper method to print the array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
