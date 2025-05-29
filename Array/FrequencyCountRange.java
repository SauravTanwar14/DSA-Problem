package Array;



public class FrequencyCountRange {

    static void printFrequencies(int arr[], int n, int p) {

        // Decrease all elements by 1 to fit into the range [0, n-1]
        for (int i = 0; i < n; i++) {
            arr[i]--;
        }

        // Use the array elements to store both original values and counts
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0 && arr[i] < n) {
                int index = arr[i] % n;
                arr[index] += n;
            }
        }
        

        // Extract the frequencies
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }

    public static void main(String[] args) {
        //int arr[] = {2, 3, 3, 2, 5};
        int arr[] ={8,9};

        int n = arr.length;

        int p = 5;

        printFrequencies(arr, n, p);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
