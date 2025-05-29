package Array;

public class InsertAtEnd {

    public static void main(String[] args) {
        
    }

    static void insertEnd(int arr[]){

        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){

            if(max<arr[i]){
                smax=max;
                max=arr[i];
            }else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }

            

        }

    }

}
