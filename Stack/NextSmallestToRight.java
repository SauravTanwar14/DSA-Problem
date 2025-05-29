package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextSmallestToRight {

    public static List<Integer> findNextSmallestRight(int arr[]){

        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1;i>0;i--){

            while(!stack.isEmpty() && arr[i]<=stack.peek()){
                stack.pop();
            }

            if(stack.empty()){
                result.add(-1);
            }else{
                result.add(stack.peek());
            }

            stack.push(arr[i]);
        }

        return result;
    }

    
        public static void main (String[] args) {
	
            int[] arr=new int[]{5,15,10,8,6,12,9,18};
            
           List<Integer> result = findNextSmallestRight(arr);
            System.out.println(result);
        } 
    
}
