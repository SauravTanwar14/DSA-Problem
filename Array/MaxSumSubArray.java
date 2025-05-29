package Array;

public class MaxSumSubArray {

    static int maxSum(int arr[],int n){

        int maxsum=arr[0];
        int maxEnding =arr[0];

        for(int i=1;i<n;i++){

            maxEnding =Math.max(maxEnding +arr[i], arr[i]);

            maxsum = Math.max(maxEnding, maxsum);
        }

        return maxsum;

    }

    //maximumSum of size K Uisng window sliding technique
    public static int maxSumSubArraySize(int arr[],int k){

        int i=0;
        int j=0;
        int curr_sum=0;
        int max_sum=0;

        while(j<arr.length){
            curr_sum += arr[j];

            if(j-i+1==k){

                max_sum=Math.max(max_sum, curr_sum);

                curr_sum = curr_sum-arr[i];
                i++;
            }
            j++;
        }

        return max_sum;
    }

    public static void main(String[] args) {
        
       // int arr[] = {-3,8,-2,4,-5,6};

        //int arr[] = {1, 2, 3, -2, 5};

        int arr[] = {1,9,2,7,5};

        int n = arr.length;

        int k=3;

        System.out.println("max sum of subarray  "+maxSum(arr, n));
        System.out.println("max sum of size "+ k +" subarray  "+maxSumSubArraySize(arr, k));
    }

}
