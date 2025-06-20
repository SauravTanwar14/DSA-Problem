package Array;

public class LongestEvenOdd {

    static int maxLength(int arr[],int n){

        int res=1;

        int count=1;

        for(int i=1;i<n;i++){

            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){

                count++;

                res = Math.max(count, res);

            }else{
                count=1;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int arr[] = {5,10,20,6,3,8};
        
        int n = arr.length;

        System.out.println("longest even odd length "+maxLength(arr, n));

}
}
