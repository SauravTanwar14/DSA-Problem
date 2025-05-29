package Array.TwoDArray;

public class TransposeMatrix {

//First solution
 static void tranpose(int arr[][]){

    //int temp[][] = new int[arr.length][arr[0].length];  
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){

            if(j>i){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
 }

 //2nd solution
 static void tranpose1(int arr[][]){

    //int temp[][] = new int[arr.length][arr[0].length];  
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr[0].length;j++){

            
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            
        }
    }
 }
 public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    //tranpose(matrix);
    tranpose1(matrix);

    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){

           System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
 }
}
