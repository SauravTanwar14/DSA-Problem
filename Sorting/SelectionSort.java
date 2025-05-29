package Sorting;

public class SelectionSort {

    public static void sort(int arr[]){

        int n = arr.length;

        for(int i=0; i<n-1 ;i++){

            int min_indx=i;

            for(int j=i+1;j<n;j++){

                if(arr[j] < arr[min_indx]){
                    min_indx =j;
                }

               
            }
            int temp = arr[min_indx];
            arr[min_indx] =arr[i];
            arr[i] = temp;
        }

    }

    // Prints the array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

    // Driver code to test above
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}


}
