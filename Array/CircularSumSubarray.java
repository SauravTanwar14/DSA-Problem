package Array;

public class CircularSumSubarray {

    //kadane's alogrithm

    static int normalMaxSum(int arr[],int n){

        int res=arr[0];
        int maxEnding =arr[0];

        for(int i=1;i<n;i++){

            maxEnding =Math.max(maxEnding +arr[i], arr[i]);

            res = Math.max(maxEnding, res);
        }

        return res;

    }

    //max sum for circular array
    static int overalMaxSum(int arr[],int n){

        int max_sum = normalMaxSum(arr, n);

        if(max_sum<0){
            return max_sum;
        }

        int arr_sum =0;

        for(int i=0 ;i<n;i++){
            arr_sum += arr[i]; 

            arr[i] = -arr[i];

        }

        int max_circular = arr_sum+normalMaxSum(arr, n);

        return Math.max(max_sum,max_circular);

    }

    public static void main(String[] args) {
        int arr[] ={8,-4,3,-5,4};
        int n = arr.length;

        System.out.println("Maximum circular array "+overalMaxSum(arr, n));
    }

}
