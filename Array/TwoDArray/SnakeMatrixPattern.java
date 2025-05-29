package Array.TwoDArray;

public class SnakeMatrixPattern {

    //snake pattern in matrix----. row to row
    public static void snakeMatrix(int arr[][]){

        for(int i=0;i<arr.length;i++){

            if(i%2==0){
               for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
               }
            }
            else{
                for(int j=arr[i].length-1;j>=0;j--){

                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        
    }

    //wave traversal in matrix---> column to column

    static void waveTraversal(int arr[][]){

        for(int i=0 ; i<arr[0].length;i++){

            if(i%2==0){
                for(int j=0;j<arr.length;j++)
                {
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int j=arr.length-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.err.println("Snake pattern matrix");

        snakeMatrix(matrix);

        System.out.println("wave tarversal");
        waveTraversal(matrix);
    }
}
