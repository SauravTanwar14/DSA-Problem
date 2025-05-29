package Array;

public class      MoveZeroEnd {

    static void moveZero(int arr[]){

        int count =0;

        int temp=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){

                temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;

                count++;

            }
        }
    }

    //Overwrite + Fill Zero Approach
    static void moveZeroes(int[] arr) {
        int j = 0; // Pointer for placing non-zero elements

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i]; // Overwrite values
            }
        }

        // Fill remaining positions with zero
        while (j < arr.length) {
            arr[j++] = 0;
        }
    }

    public static void main(String[] args) {
        
        int arr[]={10,8,0,0,12,0};

        moveZero(arr);

        for(int n : arr){
            System.out.print(n+" ");
        }
    }

}
