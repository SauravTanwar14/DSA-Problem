package Array;

public class Test {
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int left = 0;
        int right = arr.length - 1;

        // If the array is not rotated
        if (arr[left] < arr[right]) {
            return arr[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return arr[left];
    }

    public static void main(String[] args) {
        int arr[] = {5,6,1,2,3,4};
        System.out.print(findMin(arr));

        int arr1[] = {91,96};
        System.out.print(findMin(arr1));
    }
}
