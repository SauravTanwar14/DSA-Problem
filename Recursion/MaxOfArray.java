package Recursion;

public class MaxOfArray {

    public static int max(int arr[],int index){

        if(arr.length == index){
            return Integer.MIN_VALUE;
        }

        int l =arr[index];
        int r = max(arr, index+1);

        int ans = Math.max(l,r);

        return ans;
    }

    public static void main(String[] args) {
        
        int arr[] ={2,6,4,9,5};
        int index = 0;

        System.out.println("result "+max(arr, 0));
    }
}
