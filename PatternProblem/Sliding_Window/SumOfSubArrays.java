
package Sliding_Window;

public class SumOfSubArrays {

    public static void sumofAllSubarrays(int arr[],int k){
        // taking two pointer
        int i=0;
        int j=0;

        int curr_sum=0;
        //int maxsum=0;

        while(j<arr.length){
            curr_sum =curr_sum+ arr[j];

            if(j-i+1 == k){
                System.out.print(curr_sum+" ");
                curr_sum = curr_sum-arr[i];
                i++;
            }
            j++;
        }

    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        int k=3;
        sumofAllSubarrays(arr, k);
    }
}