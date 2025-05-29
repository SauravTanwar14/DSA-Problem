package Array.TwoDArray;

public class MatrixTraversal {

    public static void print(int arr[][]){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.err.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int arr[][]= {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
    };

    print(arr);

}

}
