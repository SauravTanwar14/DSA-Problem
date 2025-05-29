package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Stock_Span {

   static void printSpan(int arr[],int n){

    Stack<Integer> s = new Stack<>();
    s.add(0);

    System.out.print(1+" ");

    for(int i=1;i<n;i++){

        while (s.isEmpty()==false && arr[s.peek()]<= arr[i]) {
            s.pop();
            
        }

        int span = s.empty() ? i+1 : i-s.peek();

        System.out.print(span+" ");

        s.push(i);
    }
   }

   public static int[] calculateSpan(int[] prices) {
    int n = prices.length;
    int[] span = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
        // Pop elements from stack while the stack is not empty and the price at the top of the stack is less than or equal to current price
        while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
            stack.pop();
        }

        // If stack is empty, span is i + 1 (all previous prices are smaller)
        if (stack.isEmpty()) {
            span[i] = -1;
        } else {
            // Span is the difference between current index and index of last higher price
            span[i] = i - stack.peek();
        }

        // Push this element's index onto the stack
        stack.push(i);
    }

    return span;
}
   public static void main(String[] args) {

    int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.println("Stock prices: " + Arrays.toString(prices));
        System.out.println("Span values: " + Arrays.toString(span));

   }
}
