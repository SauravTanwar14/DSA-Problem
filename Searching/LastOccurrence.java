package Searching;

public class LastOccurrence {

    //Recursive function to find last occurence of x
    public static int lastOcc(int arr[],int low,int high,int x,int n){

        if(low>high)
        return -1; //base condition

        int mid = (low+high)/2;

        if(x>arr[mid])
        return lastOcc(arr, mid+1, high, x,n);
        else if(x<arr[mid])
        return lastOcc(arr, low, mid-1, x,n);

        else{
            if(mid==n-1 || arr[mid] != arr[mid+1]){
                return mid;
            }else{
                return lastOcc(arr, mid+1, high, x,n);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 10, 10, 18, 20};
        int x = 10;
        int n = arr.length;
        int result = lastOcc(arr, 0, arr.length - 1, x ,n);
        
        if (result != -1)
            System.out.println("First occurrence of " + x + " is at index: " + result);
        else
            System.out.println(x + " not found in the array.");
    }
}
