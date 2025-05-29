package Array;
public class SubArraySum {

    //navie approach
    public static boolean isSubArraySum(int arr[],int sum){

        //boolean flag = false;
        
        for(int i =0 ; i<arr.length ; i++){

            int curr_sum =0;

            for(int j=i;j<arr.length  ;j++){

                curr_sum += arr[j];

                if(curr_sum == sum){
                    return true;
                }

            }
            
        }
        return false;
    }

    public static boolean isSubArraySum1(int arr[],int sum){

        int n = arr.length;

       // boolean flag = false;

        int curr_sum = arr[0];

        for(int i=1;i<n;i++){

            curr_sum += arr[i];

            if(curr_sum ==sum){

                return true;
            }
            
        }
        return false;
        
    }



    public static void main(String[] args) {
        int arr[]={3,2,0,4,7};
        int sum=6;

        System.out.println("sum is found: "+isSubArraySum1(arr, sum));
    }

}
