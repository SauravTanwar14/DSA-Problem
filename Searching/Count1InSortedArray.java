package Searching;

//Count 1s in a Sorted Binary Array
public class Count1InSortedArray {

    public static int countOnes(int arr[],int n){

        int low=0;
        int high=n-1;

        while(low<=high){

            int mid = (low+high)/2;

            // if mid is zero then we go right side of array
            if(arr[mid]==0){
                low= mid+1;//updating the low
            }
            else{

                //if mid and mid-1 is zero so we can calculate total number of 1 as we array is sorted
                if(mid ==0 || arr[mid-1] == 0){

                    return(n-mid);

                }
                //shifting high 
                else{
                    return high=mid-1;
                }
            }

        }
        return 0;
    }

    public static void main(String args[]) 
    {
        int arr[] = {0, 0, 1, 1, 1, 1}, n = 6;


		System.out.println(countOnes(arr, n));

    } 
}
