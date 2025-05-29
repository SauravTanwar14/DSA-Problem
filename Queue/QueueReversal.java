package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {

    public static void reverseQueueUsingStack(Queue<Integer> queue) {

        if (queue.isEmpty())
            return;

        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // reverse queue using recusrion
    public static Queue<Integer> reverseUsingrecursion(Queue<Integer> queue) {

        if (queue.isEmpty())
            return queue;

        int l = queue.poll();
        Queue<Integer> r = reverseUsingrecursion(queue);
       r.add(l);

       return queue;

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        // Reverse the queue using the stack
        reverseQueueUsingStack(queue);

        // Print the reversed queue
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        

        Queue<Integer> reversequeue = new LinkedList<>();
        reversequeue =  reverseUsingrecursion(queue);
       
        System.out.println(reversequeue.poll());
        
    }

}
