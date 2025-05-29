package Stack;

class StackUsingArray {

    int arr[];
    int top;
    int cap;

    public  StackUsingArray(int c){
        top=-1;
        cap=c;
        arr=new int[cap];
    }

    void push(int x){
        if(top==cap-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        arr[top]=x;
    }

    int pop(){
        if(top==-1){
            System.out.println("Underflow");
            return -1;
        }
        int res = arr[top];
        top--;
        return  res;
    }

    int size(){
        return  top+1;
    }

    boolean isEmpty(){
        return (top==-1);
    }
}
public class ArrayImplemenation {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());

    }
}
