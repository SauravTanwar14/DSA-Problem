package Array;

public class Frequency {

    static void printFrequencies(int arr[],int n){

        int current = arr[0];

        int count=1;

        for(int i=1;i<n;i++){
         // If current element is same as previous, increment count
            if(arr[i] == current){
                count++;
            }else{
                 // Print frequency of previous element
                 System.out.println(current + " : " + count);

                 current = arr[i];
                 count =1;

            }
        }
        System.out.println(current + " : " + count);
    }

    public static void main(String[] args) {
       // int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5};

        int arr[] = {1,10,2,1,2,3,4,3,4,10};

        int n = arr.length;

        printFrequencies(arr,n);
    }

}
