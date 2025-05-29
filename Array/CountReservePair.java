package Array;
import java.util.Arrays;

public class CountReservePair {

    public static int countReservePair(int arr[],int N){

        int count =0;

        for(int i=0;i<N;i++){
            for(int j =i+1 ;j<N ;j++){

                if(arr[i] > 2*arr[j]){
                    count++;
                }
            }
        }
        return count;
    }


    //optimise approach
    public static int countReserve(int arr[],int N){

        int count =0;

        Arrays.sort(arr);

        for(int i=0;i<N-1;i++){
           // int j = i+1;
           while(i<N)
           {}
            if(arr[i+1]>2*arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]= {3, 2, 4, 5, 1, 20};

        int N = arr.length;

        System.out.println("no reserve pair in array: "+countReserve(arr, N));
    }
    
}
