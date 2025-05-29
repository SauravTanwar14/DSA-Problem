package Searching;
public class BinarySearch {
    
    public static int binarySearch(int arr[],int x){
        
        int low = 0;
        int high = arr.length-1;
        

        while(low<high){
            
            int mid = low + (high-low)/2;

               //searching value equal to mid value
        if(arr[mid] == x){
            return x;
        }

        //greater than mid
        if(arr[mid]>x){
            low = mid+1;
        }
        else{
            high = mid-1;
        }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;

        int result = binarySearch(arr, x);

        if(result == x){
            System.out.println("Value is found");
        }
        else{
            System.out.println("Value is found");
        }
    }
}
