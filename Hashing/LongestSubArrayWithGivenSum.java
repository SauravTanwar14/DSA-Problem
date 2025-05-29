package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    public static int largestSubarrayWithSumX(int[] arr, int x) {
        int maxLen=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==x){
                maxLen=i+1;
            }

            if(map.containsKey(sum-x)){
                maxLen=Math.max(maxLen,i-map.get(sum-x));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] ={1,-1,5,-2,3};
        int x =3;
        int result = largestSubarrayWithSumX(arr,x);
        System.out.println(result);
    }
}
