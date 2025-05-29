package Array;
public class MissingNumber {
    

    //1st solution
    public static int missingNumber(int arr[]){
        int n = arr.length+1;

        int sum =0;

        for(int i=0;i<arr.length;i++){

        sum = sum + arr[i];
        }

        int total= (n*(n+1))/2;

        return (total - sum);
    }

    //optimise solution
    public static int missingNumberOptimised(int arr[]){
        
        int n= arr.length;
        
        for(int i=0;i<n;i++){
            
            int element = arr[i];
            int index=element-1;
            
            if(arr[index]<=n){
                arr[i]=-arr[index];
            }
        }
        
        for(int i=0;i<n;i++){
            
            if(arr[i]>0){
                return i;
               
            }
        }
        
        return n+1;
    }
    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        // Calculate the sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5};

        System.out.println("missing number is : "+ missingNumberOptimised(arr));
        //System.out.println("missing number is : "+ findMissingNumber(arr));

    }
}
