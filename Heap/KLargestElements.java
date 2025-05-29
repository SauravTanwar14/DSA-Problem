package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestElements {
    public static int[] findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) return new int[0];

        // Min-Heap to store the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add first K elements to the heap
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }

        // Process remaining elements
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();  // Remove smallest
                minHeap.add(arr[i]); // Insert new larger element
            }
        }

        // Extract K largest elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }

    public static List<Integer> findKLargestElement(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int n : arr){
            minHeap.add(n);
            if(minHeap.size()>k){
                minHeap.poll();//remove smallest
            }
        }

        // Convert to list and sort in descending order
        List<Integer> result = new ArrayList<>(minHeap);
        result.sort(Collections.reverseOrder());
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int[] result = findKLargest(arr, k);

        // Print result
        System.out.println("K largest elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println("");

        System.out.print("K largest elements: ");
        List<Integer> result1 = findKLargestElement(arr,k);
        for (int num : result1) {
            System.out.print(num + " ");
        }
    }
}

