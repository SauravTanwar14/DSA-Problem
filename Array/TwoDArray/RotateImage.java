package Array.TwoDArray;

public class RotateImage {

    static void printMatrix(int arr[][]) {

        // int temp[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
    }

    static void reverseMatrix(int arr[][]){
        

        for(int i=0;i<arr.length;i++){

            int left=0;
        int right=arr[0].length-1;

            while (left<right) {

                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;

                right--;
                left++;
            
            }
        }

        

     }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printMatrix(matrix);

        reverseMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
