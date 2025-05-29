package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreater {

    static ArrayList<Integer> nextGreater(int arr[] , int n){

        Stack<Integer> s = new Stack<>();

        ArrayList<Integer> v = new ArrayList<>();

        s.add(arr[n-1]);
        v.add(-1);

        for(int i = n-2; i>=0;i--){

            while(s.isEmpty()==false && s.peek() <= arr[i]){
                s.pop();
            }

            int ng = s.isEmpty() ? -1 : s.peek();

            v.add(ng);
            s.add(arr[i]);

        }
        Collections.reverse(v);

        return v;
    }

    //logicmojo code
    private static List<Integer> findNearestGreaterToRight(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements from the stack until we find a greater element or the stack becomes empty
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }

            // If the stack is empty, there is no greater element to the right
            if (stack.isEmpty()) {
                ans.add(-1);
            } else {
                // otherwise peek represents the next greater element
                ans.add(stack.peek());
               
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }
        Collections.reverse(ans);

        return ans;
    }

    public static void main (String[] args) {
	
	    int[] arr=new int[]{5,15,10,8,6,12,9,18};
        
       List<Integer> result = findNearestGreaterToRight(arr);
        System.out.println(result);
    } 

}
