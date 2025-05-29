package Searching;

public class FirstOcurrence {

    // Recursive function to find the first occurrence of x
    public static int firstOccRecursive(int arr[], int low, int high, int x) {

        if (low > high)
            return -1; // Base case: element not found

        int mid = (low + high) / 2;

        // If x is greater, ignore the left half
        if (x > arr[mid]) 
            return firstOccRecursive(arr, mid + 1, high, x);

        // If x is smaller, ignore the right half
        else if (x < arr[mid]) 
            return firstOccRecursive(arr, low, mid - 1, x);

        // When arr[mid] == x
        else {
            // Check if it's the first occurrence (or it's the first element in the array)
            if (mid == 0 || arr[mid - 1] != arr[mid])
                return mid;
            else
                // Continue searching in the left half
                return firstOccRecursive(arr, low, mid - 1, x);
        }
    }

    //Itreavtive function for first occurence of x
    public static int firstOccIterative(int arr[],int n , int x){

        int low = 0, high = n - 1;

        while(low<high){
            
            int mid = (low+high)/2;

            //when x is greater than mid
            if(x>arr[mid]){

                low = mid+1;

                //when x is less than mid
            }else if(x<arr[mid]){

                high = mid-1;
            }

            //when x is equal to mid
            else{
                if(mid==0 || arr[mid-1] != arr[mid]){
                    return mid;
                }
                else
                {
                    high = mid-1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 10, 10, 18, 20};
        int x = 10;
        int result = firstOccRecursive(arr, 0, arr.length - 1, x);
        
        if (result != -1)
            System.out.println("First occurrence of " + x + " is at index: " + result);
        else
            System.out.println(x + " not found in the array.");
    }
}

