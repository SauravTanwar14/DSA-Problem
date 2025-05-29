package Array;

public class WaveArray {

    static void waveArray(int arr[],int n){

        int temp =0;

        for(int i=1;i<n;i++){

            temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]= temp;

            i++;
            
        }
    }

    public static void main(String[] args) {
       // int arr[] = {1,2,3,4,5};
        int arr[] ={2,4,7,8,9,10};

        int n= arr.length;

        waveArray(arr, n);

        System.out.println("after waving the array");

        for(int i=0;i<n;i++){
            System.out.print(" "+ arr[i]);
    }
}

}
