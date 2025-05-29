package Stack;

import java.util.Stack;

public class MaximalRectangle {
    
    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];  // Array to store heights of histogram bars
        int maxArea = 0;

        // Iterate over each row in the matrix
        for (int i = 0; i < rows; i++) {
            // Update heights based on the current row
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;  // Increase the height of the bar
                } else {
                    heights[j] = 0;  // Reset height to 0 if it's '0'
                }
            }

            // Calculate the largest rectangle area for the histogram at the current row
            maxArea = Math.max(maxArea, largestRectangleInHistogram(heights));
        }

        return maxArea;
    }

    private static int largestRectangleInHistogram(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
            stack.push(i);
        }

        // Final calculation for the remaining bars in the stack
        while (!stack.isEmpty()) {
            int h = heights[stack.pop()];
            int w = stack.isEmpty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, h * w);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };

        System.out.println("Maximal Rectangle Area: " + maximalRectangle(matrix));
    }
}

