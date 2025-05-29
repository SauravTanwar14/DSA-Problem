package Array;

public class ReverseArrayGroup {

    static void reverseGroup(int arr[],int n ,int d){

        if(d>= arr.length){
            reverse(arr,0,n-1);
        }else{
            reverse(arr,0,d-1);

            //reverse(arr,d,n-1);
        }

        
    }

    private static void reverse(int[] arr, int low, int high) {
        
       // int temp;

        while(low<high){
            int temp=arr[low];
            arr[low] = arr[high];
            arr[high]=temp;

            low++;
            high--;

        }


        }
    
    public static void main(String[] args) {
       int  k = 5;
       //int[] arr= {1, 2, 3, 4, 5};
       int[] arr= {1, 2, 3, 4};

       int n = arr.length;

       reverseGroup(arr,n,k);

       for (long num : arr) {
        System.out.print(num + " ");
    }
    }

}
