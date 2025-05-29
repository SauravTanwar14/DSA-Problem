package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Majority Element II - Elements occurring more than ⌊N/3⌋ times
public class MajorityOfElement {

    static List<Integer> findMajority(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        // Finding frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);  // Correctly increment count
        }

        // Iterate over each key-value pair in the hash map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            
            // Add the element to the result if its frequency is greater than ⌊n/3⌋
            if (count > n / 3) {
                res.add(entry.getKey());
            }
        }

        return res;
    }

    // Boyer-Moore Voting Algorithm
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};  // Example array
        List<Integer> res = findMajority(arr);
        
        // Printing the result
        for (int ele : res) {
            System.out.print(ele + " ");  // Output: 2 1
        }
    }
}
