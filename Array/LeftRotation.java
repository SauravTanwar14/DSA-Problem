package Array;

public class LeftRotation {

    static void rotateByPos(int arr[],int n ,int d){

        d = d % n;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }

    static void reverse(int[] arr, int low, int high) {
        
        while(low<high){
            int temp=arr[low];
            arr[low] = arr[high];
            arr[high]=temp;

            low++;
            high--;

        }
    }

    public static void main(String[] args) {
       int  arr[] = {2,4,6,8,10,12,14,16,18,20};
       int d = 3;
       int n = arr.length;

       rotateByPos(arr,n,d);

       for (long num : arr) {
        System.out.print(num + " ");
    }
    }

}
