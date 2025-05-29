package Hashing;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static int[] pairSum(int[] arr, int k) {


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = k - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1}; // no pair found

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 6;
        int[] result = pairSum(arr, k);
        System.out.println("Pair with sum " + k + ": (" + result[0] + ", " + result[1] + ")");
    }
}
