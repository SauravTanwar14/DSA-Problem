package Array;

public class MaxConsectiveOne {

    static int maxOne(int arr[],int n){

        int count=0;
        int res=0;

        for(int i=0;i<n;i++){

            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }

            res= Math.max(res, count);
        }
        return res;
    }

    public static void main(String[] args) {
        //int arr[] ={0,1,1,0,1,0};
        //nt arr[] ={1,1,1,1};
        //int arr[] ={0,0,0,0};
        int arr[] ={1,0,1,1,1,1,0,1,1};
        int n = arr.length;

        System.out.println("max consecutive one's  "+maxOne(arr, n));
    }

}
