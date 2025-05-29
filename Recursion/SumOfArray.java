package Recursion;

public class SumOfArray {

    static int sum(int arr[],int index){

        if(index==arr.length){
            return 0;
        }

        int l=arr[index];
        int r=sum(arr,index+1);

        int ans=l+r;

        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int index=0;

        System.out.println("result "+sum(arr, index));
    }
}
