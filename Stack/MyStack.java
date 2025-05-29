package Stack;

import java.util.Stack;

//n this problem we are required to design a Stack that can implement the 
//regular stack operations ie. push( ), pop( ), isEmpty( ), size( ) etc. 
//along with the getMin( ) operation ( to fetch minimum element present in the stack) efficiently.
// We will first look at a Naive approach for doing this, followed by an Efficient Approach using an auxilary stack

public class MyStack {

    Stack<Integer> ms;
    Stack<Integer> as;

    MyStack(){
        ms = new Stack<>();
        as = new Stack<>();
    }

    void push(int x){

        if(ms.isEmpty()){
            ms.add(x);
            as.add(x);
            return;
        }

        ms.add(x);

        if(as.peek() >= ms.peek()){
            as.add(x);
        }
    }

    void pop(){

        if(as.peek() == ms.peek()){
            as.pop();
        }
        ms.pop();
    }

    int top() {
        return ms.peek();
      }
    
   int getMin() {
         return as.peek();
      }

      public static void main(String[] args) {
        
        MyStack s = new MyStack();
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();
     
        System.out.print(" Minimum Element from Stack: " + s.getMin() );
      }


}
