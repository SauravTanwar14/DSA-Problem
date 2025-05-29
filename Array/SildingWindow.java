package Array;
public class SildingWindow {


    //navie solution
    
    public static int maxSildingWindowSum(int arr[],int k){

        int n = arr.length;
        int res =0;

        for(int i =0 ;i+k-1<n ;i++){

            int curr_sum=0;

            for(int j=0;j<k;j++){

                curr_sum += arr[i+j];
            }

            res = Math.max(res, curr_sum);
        }

        return res;

    }

    //optimial or efficient solution
    public static int maxSildingWindowSum1(int arr[],int k){

        int n = arr.length;
       
        int curr_sum=0;

        for(int i =0 ;i<k ;i++){

            curr_sum  += arr[i];
        }
            int res =curr_sum;

            for(int j=k;j<n;j++){

                curr_sum = curr_sum+arr[j]-arr[j-k] ;
                res = Math.max(res, curr_sum);
            }

            return res;
        

    }

    public static int maxsumsubarray(int arr[],int k){

        int j=0;
        int i=0;
        int maxsum=0;
        int curr_sum=0;
        while(j<arr.length){

             curr_sum += arr[j];

            if(j-i+1==k){
                
                maxsum= Math.max(maxsum, curr_sum);
                curr_sum  = curr_sum- arr[i];

                i++;
            }
            j++;
        }
        return maxsum;
    }

    //average
    public static void averagesumsubarray(int arr[],int k){

        int j=0;
        int i=0;
        //int maxsum=0;
        double avg=0;
        double curr_sum=0;
        while(j<arr.length){

             curr_sum += arr[j];

            if(j-i+1==k){
                
               avg = curr_sum/k;
                curr_sum  = curr_sum- arr[i];

                i++;
            }
            j++;
        }
        
    }

    public static void main(String[] args) {
       // int arr[]={10,5,-2,20,1};
       int arr[]={1,8,30,-5,20,7};
        int k = 4;

        System.out.println("max sum: "+maxSildingWindowSum1(arr, k));
        System.out.println("max sum: "+maxsumsubarray(arr, k));

    }

}
