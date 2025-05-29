package LinkedList;

/*To detect a loop in a linked list, we can use Floyd's Cycle-Finding Algorithm, also known as the Tortoise and Hare algorithm. This method uses two pointers that traverse the linked list at different speeds to determine if a loop exists.

Steps:
Initialize two pointers:

slow pointer (Tortoise): Moves one step at a time.
fast pointer (Hare): Moves two steps at a time.
Traverse the linked list:

Move the slow pointer one step and the fast pointer two steps at a time.
If there is no loop, the fast pointer will reach the end of the list (None).
If there is a loop, the fast pointer will eventually meet the slow pointer inside the loop.
Check for loop:

If at any point the slow pointer meets the fast pointer, a loop is detected.
If the fast pointer reaches the end of the list (None), there is no loop. */

public class CycleDetect {

    public static boolean detectLoop(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // Creates a cycle (node4 -> node2)

        System.out.println("Loop detected: " + detectLoop(node1));  // Should print true
        
        // Example of a linked list without a loop
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node5.next = node6;

        System.out.println("Loop detected: " + detectLoop(node5));   // Should print false
    }
}
