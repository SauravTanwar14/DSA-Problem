package Array;

public class SecondMax {

    public static int secondMax(int arr[],int n){

        int max = Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            if(arr[i]>max)
            {
                smax= max;
                max = arr[i];
                
            }
        }

        return smax;

    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7};

        int n = arr.length;

        System.out.println("result "+secondMax(arr, n));
    }

}
