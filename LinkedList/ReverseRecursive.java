package LinkedList;

public class ReverseRecursive {
    public static Node reverseRecursive(Node head) {
        // Step 1: Base Case - Stop Recursion when we reach the last node
        if (head == null || head.next == null) {
            return head; // Return the last node as new head
        }

        // Step 2: Recursively reverse the rest of the list
        Node newHead = reverseRecursive(head.next);

        // Step 3: Reverse the pointer of the current node's next node
        head.next.next = head; // Reverse the link: next node points back to current node

        // Step 4: Set the current node's next to null (to avoid cycles)
        head.next = null;

        // Step 5: Return new head of reversed list
        return newHead;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " → ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original List:");
        printList(head);

        head = reverseRecursive(head);

        System.out.println("Reversed list:");
        printList(head);
    }

}
