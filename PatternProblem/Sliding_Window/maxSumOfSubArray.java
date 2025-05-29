package Sliding_Window;

public class maxSumOfSubArray {

    public static int maxSumOfSubArray(int arr[],int k){
        int i=0;
        int j=0;

        int curr_sum=0;
        int max_sum=0;

        while(j<arr.length){
            curr_sum = curr_sum+arr[j];

            if(j-i+1 == k){
                max_sum = Math.max(curr_sum, max_sum);
                curr_sum = curr_sum-arr[i];
                i++;
            }
            j++;
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] ={1,9,2,7,5};
        int k=3;

        int result =maxSumOfSubArray(arr, k);
        System.out.println("max "+ result);
    }
}
