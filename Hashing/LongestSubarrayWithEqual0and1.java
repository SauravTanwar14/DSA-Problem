package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithEqual0and1 {

    //naive solution
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            int c0 = 0;
            int c1 = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0) {
                    c0++;
                } else {
                    c1++;
                }

                if (c1 == c0) {
                    res = Math.max(res, j - i + 1);
                }
            }

        }
        return res;
    }

    /*🔧 Approach (Using HashMap)
Convert all 0s in the array to -1

When 0 → -1, equal number of 0s and 1s means the net sum becomes 0.

Use a HashMap to store the first occurrence of each prefix sum

If the same prefix sum occurs again, it means the subarray between them sums to 0 → equal 0s and 1s

*/
    public static int findMaxLengthUsingMap(int[] nums) {
        int n= nums.length;
        int sum =0;
        int maxLen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum += nums[i]==0? -1:1;//convert 0 to -1
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen,i-map.get(sum));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }//prefix sum, index
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,0,1,0};
        int result = findMaxLength(arr);
        System.out.println(result);

        int resultMap = findMaxLengthUsingMap(arr);
        System.out.println(resultMap);
    }
}
