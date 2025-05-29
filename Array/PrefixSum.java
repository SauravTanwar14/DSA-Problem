package Array;
public class PrefixSum {

    public static int prefixsum(int arr[],int i ,int j){

        int sum =0;

        for(i=0 ; i<=j; i++){
            sum += arr[i];
        }

        return sum;
    }
    
    public static void main(String[] args) {
        int arr[]={2,8,3,9,6,5,4};
        int i=0;
        int j=2;

        System.out.println("sum is found: "+prefixsum(arr, i, j));
    }
}
