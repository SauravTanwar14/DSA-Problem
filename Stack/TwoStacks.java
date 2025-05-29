package Stack;

class TwoStacks {
    int[] arr;
    int top1, top2, size;

    // Constructor to initialize the array and top pointers
    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1; // Stack1 starts from index 0
        top2 = n;  // Stack2 starts from index n-1
    }

    // Push in Stack1
    public void push1(int x) {
        if (top1 < top2 - 1) { // Check if space is available
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow - No space for Stack1");
        }
    }

    // Push in Stack2
    public void push2(int x) {
        if (top1 < top2 - 1) { // Check if space is available
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow - No space for Stack2");
        }
    }

    // Pop from Stack1
    public int pop1() {
        if (top1 >= 0) {
            int val = arr[top1];
            top1--;
            return val;
        } else {
            System.out.println("Stack1 Underflow");
            return -1; // Indicating error
        }
    }

    // Pop from Stack2
    public int pop2() {
        if (top2 < size) {
            int val = arr[top2];
            top2++;
            return val;
        } else {
            System.out.println("Stack2 Underflow");
            return -1; // Indicating error
        }
    }

    // Display the stacks
    public void printStacks() {
        System.out.print("Stack1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Stack2: ");
        for (int i = size - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10); // Create array of size 10

        ts.push1(1);
        ts.push1(2);
        ts.push1(3);
        ts.push2(10);
        ts.push2(9);
        ts.push2(8);

        ts.printStacks();

        System.out.println("Popped from Stack1: " + ts.pop1());
        System.out.println("Popped from Stack2: " + ts.pop2());

        ts.printStacks();
    }
}

