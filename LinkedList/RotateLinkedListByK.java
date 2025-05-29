package LinkedList;

public class RotateLinkedListByK {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        // Step 1: Find the length of the list
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        
        // Step 2: Make the list circular
        tail.next = head;
        
        // Step 3: Find the effective number of rotations (k % length)
        k = k % length;
        if (k == 0) {
            tail.next = null; // Break the circular link
            return head;
        }
        
        // Step 4: Find the new tail (length - k - 1) and new head (length - k)
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }
        
        // Step 5: Set the new head and break the circular link
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
    public static void main(String[] args) {
        // Example: Create a sample linked list.
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the sub-list from position 2 to 4.
        head = rotateRight(head,2);

        System.out.println("Reversed Sub-list (2 to 4):");
        printList(head);
    }

    // Helper method to print the linked list.
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

}

/*Explanation:
ListNode class: Represents a node in the singly linked list with an integer value (val) and
 a reference to the next node (next).
rotateRight method:
Step 1: We first calculate the length of the linked list by traversing it from the head to the last node.
Step 2: We make the list circular by connecting the last node (tail) to the head.
Step 3: We compute the effective rotation (k % length), because rotating the list by 
a number greater than or equal to the list's length is redundant.
Step 4: We find the new tail, which is located at the (length - k - 1)-th node,
 and the new head, which is the node after the new tail.
Step 5: We set the next of the new tail to null to break the circular connection
and return the new head of the rotated list.
Example:
Consider the list 1 -> 2 -> 3 -> 4 -> 5 and k = 2.

Length of the list is 5.
Rotating the list by k % 5 = 2 means the last two elements (4 and 5) will move to the front.
The new list after rotating would be 4 -> 5 -> 1 -> 2 -> 3.
Time Complexity:
O(n), where n is the length of the list, because we traverse 
the list a few times (to find the length, to make it circular, and to find the new head and tail). */


