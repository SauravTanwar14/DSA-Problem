package Tree;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    static int minJump(int arr[]){
        int n = arr.length;

        if(arr[0]==0)
            return -1;

        int i=0;
        int count =0;

        while(i<=n){
            int k = arr[i];

            if(k==0 && i>n)
                return -1;
            if(i+k>=n)
                return count+1;
            else  {
                count++;
                i =i+k;

            }
        }
        return count;

    }
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        int arr1[] = {1, 4, 3, 2, 6, 7};

        //System.out.println(minJump(arr));
        System.out.println(minJump(arr1));
    }
}
