package Recursion;

public class CheckArraySorted {
public static boolean sorted(int arr[],int i){
   
    if(arr.length==0){
        return true;
    }
    if(arr[i]==arr[arr.length-1]){
        return true;
    }

    boolean l = arr[i]<arr[i+1];

    boolean r= sorted(arr, i+1);

    boolean ans = l && r;

    return ans;

}
public static void main(String[] args) {
    int arr[]={1,2,3,6,4,5};
    int i=0;

    boolean result = sorted(arr, i);
    System.out.println(result);
}
}
