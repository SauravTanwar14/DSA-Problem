package Stack;

import java.util.Stack;

public class Pervious_Greater_Element {

    static void pervGreater(int arr[],int n){
        Stack<Integer> s = new Stack<>();

        s.add(arr[0]);

        for(int i =0 ;i<n;i++){

            while(s.isEmpty()==false && s.peek()<= arr[i]){
                s.pop();
            }

            int pg = s.isEmpty() ? -1 : s.peek();

            System.out.print(pg + " ");

            s.push(arr[i]);
        }
    }

    public static void main (String[] args) {
	
	    int[] arr=new int[]{20,30,10,5,15};

        int n = arr.length;
        
        pervGreater(arr,n);   
	  
	}

}
