package LinkedList;

public class ReorderLinkedList {

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return; // No reordering needed for empty or single-node lists.
        }

        // Step 1: Find the middle of the list.
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list.
        ListNode secondHalf = reverseList(slow.next);
        slow.next = null; // Split the list into two halves.

        // Step 3: Merge the two halves.
        ListNode firstHalf = head;
        while (secondHalf != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    // Helper function to reverse a linked list.
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // Helper function to print the linked list.
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
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

        // Reorder the linked list.
        reorderList(head);

        System.out.println("Reordered List:");
        printList(head);
    }
}

