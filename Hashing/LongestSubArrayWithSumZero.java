package Hashing;

import java.util.HashMap;
public class LongestSubArrayWithSumZero {

    public static int  longestSubArray(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum =0;
        int maxLen =0;

        for(int i=0;i<arr.length ;i++){

            prefixSum = prefixSum+arr[i];

            if(prefixSum ==0){
                maxLen =i+1;
            }

            if(map.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i-map.get(prefixSum));
            }
            else{
                map.put(prefixSum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        
        int arr[] ={15,-2,2,-8,1,7,10,23};
        //int arr[] ={1,2,3};
        int result = longestSubArray(arr);

        System.out.println(result);
    }
    
}
