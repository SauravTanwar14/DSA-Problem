package Hashing;

import java.util.List;

import java.util.*;

public class DistinctElementsInWindow {

    public static List<Integer> distinctElementsInWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the map
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);

            // If window size exceeds k, remove the oldest element
            if (i >= k) {
                int elementToRemove = arr[i - k];
                frequencyMap.put(elementToRemove, frequencyMap.get(elementToRemove) - 1);

                if (frequencyMap.get(elementToRemove) == 0) {
                    frequencyMap.remove(elementToRemove);
                }
            }

            // Record the distinct count for the current window
            if (i >= k - 1) {
                result.add(frequencyMap.size());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        List<Integer> result = distinctElementsInWindow(arr, k);
        System.out.println("Distinct elements in each window: " + result);
    }
}
