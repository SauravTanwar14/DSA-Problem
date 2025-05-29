package Array.TwoDArray;

import java.util.ArrayList;

public class SumTriangles {

    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> result= new ArrayList<Integer>();
       int sum=0;
        for(int i=0;i<matrix[0].length;i++){
            for(int j=i;j<matrix.length;j++){
                
                 sum += matrix[i][j];
            }
        }
        result.add(sum);
        
        return result;
        
    }

    public static void main (String[] args) {
		System.out.println("GfG!");
		 int matrix[][] = { 
            { 1, 2, 3 }, 
            { 4, 5, 6 }, 
            { 7, 8, 9 }
        };
           
           int n=3;
           
           System.out.println("Result "+sumTriangles(matrix,n));
           
           
	}
}
