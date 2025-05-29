package Stack;

import java.util.Stack;

/*Steps:
Find the index of Nearest Smaller to the Left (nSL):

For each bar in the histogram, find the index of the nearest smaller bar to the left of it. If there is no smaller bar, you can set this index to -1 (or any value that indicates there is no smaller element).
Find the index of Nearest Smaller to the Right (nSR):

Similarly, for each bar, find the index of the nearest smaller bar to the right of it. If there is no smaller bar, set this index to the length of the array or n (size of histogram).
Calculate Width:

The width of the rectangle formed by a bar is nSR - nSL - 1. This gives the number of bars between the two nearest smaller bars.
Calculate the Area:

The area for each bar can be calculated as:
Area = height of the bar * width
Find the Maximum Area:

Traverse the histogram and calculate the area for each bar, keeping track of the maximum area. */

public class LargestRectangleInHistogram {

    public static int largestRectangleArea(int heights[]){
        int n = heights.length;

        // Step 1: Find nearest smaller to the left (nSL)
        int[] nSL = new int[n];  // Array to store nearest smaller to the left
        Stack<Integer> stack = new Stack<>();

        // Initialize nSL to -1
        for(int i=0;i<n;i++){
            nSL[i] = -1;
        }
        
        for(int i=0;i<n;i++){

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nSL[i] = stack.peek();
            }
            stack.push(i);
        }

        // Step 2: Find nearest smaller to the right (nSR)
        int[] nSR = new int[n];  // Array to store nearest smaller to the right
        stack.clear();  // Clear the stack for re-use
        
        // Initialize nSR to n (length of the array)
        for (int i = 0; i < n; i++) {
            nSR[i] = n;
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nSR[i] = stack.peek();
            }
            stack.push(i);
        }

        // Step 3: Calculate the area and find the maximum area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nSR[i] - nSL[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;

    }
    public static void main(String[] args) {
        
        int[] heights = {2, 1, 5, 6, 2, 3}; // Example input
        System.out.println("Largest rectangle area: " + largestRectangleArea(heights));
    }
}
