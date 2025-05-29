package Sliding_Window;

public class LongestSubArraySumZero {

    // public static int longestSubArray(int arr[]){

    //     int i=0;
    //     int j=0;
    //     int k=0;
    //     int maxLen = 0;
    //     int cws =0;

    //     while(j<arr.length){
    //          cws += arr[j];

    //          while(cws>k){

    //             cws -= arr[i];
    //             i++;
    //          }

    //          if(cws ==0){
    //             maxLen = Math.max(maxLen, j-i+1);
                
    //          }
    //          j++;
    //     }
    //     return maxLen;
    // }

    // public static void main(String[] args) {
        
    //     //int arr[] ={15,-2,2,-8,1,7,10,23};
    //     int arr[] ={1,2,3};
    //     int result = longestSubArray(arr);

    //     System.out.println(result);
    // }
}
