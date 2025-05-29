package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KSortedArray {
    public static void sortKSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int index = 0;

        // Step 1: Push first k+1 elements into min heap
        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        // Step 2: For remaining elements, pop and push
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = minHeap.poll();
            minHeap.add(i < arr.length ? arr[i] : Integer.MAX_VALUE);
        }

        // Step 3: Pop remaining elements from heap
        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        sortKSortedArray(arr, k);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
