package Stack;

import static Stack.Largest_Rectangular_Area.largestRectangleArea;

public class LargestRectangleWithAllOnes {
    public int maximalRectangle(int[][] matrix){
        if(matrix.length == 0) return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[] heights = new int[m];
        int maxArea = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    heights[j]=0;
                }else {
                    heights[j]+=1;
                }
            }
            // Get max area for this histogram row
            int area = largestRectangleArea(heights);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
