package Array;

import java.util.ArrayList;

public class IndexesofSubarraySum {

    //brute force
    static ArrayList<Integer> subarraySum(int[] arr, int target){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==target){
                    ArrayList<Integer> result = new ArrayList<Integer>();
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 9;
        ArrayList<Integer> result = subarraySum(arr, target);
        System.out.println(result);
    }
}
