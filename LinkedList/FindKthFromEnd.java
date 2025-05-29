package LinkedList;

public class FindKthFromEnd {
    public static Node findKthFromEnd(Node head, int k) {
        Node slow = head, fast = head;

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) return null; // If k is greater than list size
            fast = fast.next;
        }

        // Move both slow and fast until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // Slow now points to the K-th node from the end
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node result = findKthFromEnd(head, 2);
        System.out.println("K-th Node from End: " + (result != null ? result.data : "Not Found"));
    }
}
