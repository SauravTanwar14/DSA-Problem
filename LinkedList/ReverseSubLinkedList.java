package LinkedList;


public class ReverseSubLinkedList {

    public static ListNode reverseSubList(ListNode head, int start, int end) {
        // Edge case: if the list is empty or start == end (no reversal needed)
        if (head == null || start == end) {
            return head;
        }

        // Dummy node to simplify edge cases, like when start == 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode nodeBeforeStartNode = dummy;

        // Traverse to the node just before the start position
        for (int i = 0; i < start - 1; i++) {
            nodeBeforeStartNode = nodeBeforeStartNode.next;
        }

        // The start node and its previous node
        ListNode startNode = nodeBeforeStartNode.next;
        ListNode endNode = startNode;

        // Traverse to the end position (startNode to endNode)
        for (int i = 0; i < end - start; i++) {
            endNode = endNode.next;
        }

        // The node after the end node
        ListNode nodeAfterEndNode = endNode.next;

        // Detach the sublist (startNode to endNode) and reverse it
        endNode.next = null;  // Cut off the end of the sublist temporarily
        ListNode prev = null;
        ListNode currentNode = startNode;

        // Reverse the sublist
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }

        // Reconnect the reversed sublist
        nodeBeforeStartNode.next = prev;  // Connect the previous part of the list to the reversed sublist
        startNode.next = nodeAfterEndNode;  // Connect the last node of the reversed sublist to the part after it

        return dummy.next;  // Return the new head of the list
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
        head = reverseSubList(head, 2, 4);

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
