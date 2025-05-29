package Array;

public class SortedRotatedCheck {
    
    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return false;
        }
        
        // Check for sorted and rotated array
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]) {
                count++;
            }
        }
        
        // To be sorted and rotated, there should be exactly one place where arr[i-1] > arr[i]
        // Also check the edge case for the rotation where the last element is greater than the first one
        if (count == 1 && arr[n-1] <= arr[0]) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {2, 1, 3, 4, 5};
        int[] arr4 = {4, 5, 1, 2, 3};

        System.out.println("Array 1 is sorted and rotated: " + isSortedAndRotated(arr1)); // true
        System.out.println("Array 2 is sorted and rotated: " + isSortedAndRotated(arr2)); // false
        System.out.println("Array 3 is sorted and rotated: " + isSortedAndRotated(arr3)); // false
        System.out.println("Array 4 is sorted and rotated: " + isSortedAndRotated(arr4)); // true
    }
}

