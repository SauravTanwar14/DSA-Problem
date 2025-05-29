package Array.TwoDArray;

public class MatrixSum {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };
        
        int[][] matrixB = {
            {5, 6},
            {7, 8}
        };
        
        // Initialize the result matrix
        int[][] result = new int[2][2];
        
        // Perform matrix addition
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        // Print the result
        System.out.println("Result of Matrix Addition:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
