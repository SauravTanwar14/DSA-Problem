package Array;

public class SmallestMissingNumber {

    static int missingNumber(int[] arr) {
        int n = arr.length;

        // Place each number in its correct index
        for (int i = 0; i < n; i++) {
            while (arr[i] >= 0 && arr[i] < n && arr[i] != arr[arr[i]]) {
                int correctIndex = arr[i];
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Find the first index which doesn't match its value
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        // If all indices match their values, return n
        return n;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
       // int[] arr2 = {0, -10, 1, 3, -20};

        int missingNumber1 = missingNumber(arr1);
        System.out.println("The smallest missing number in arr1: " + missingNumber1);

    }
}

