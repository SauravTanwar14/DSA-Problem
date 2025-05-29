package LinkedList;

public class SortedInserted {

    public static Node insertSorted(Node head, int x) {
        Node newNode = new Node(x);

        //insert at begin
        if(head==null || head.data>x){
            newNode.next = head;
            return newNode;
        }

        //insert at middle and end
        Node curr = head;
        while(curr.next != null && curr.next.data<x){
           curr = curr.next;

        }
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        System.out.println("Original List:");
        printList(head);

        head = insertSorted(head, 30); // Insert 30 in sorted order
        head = insertSorted(head, 5);  // Insert 5 at the beginning
        head = insertSorted(head, 50); // Insert 50 at the end

        System.out.println("Updated Sorted List:");
        printList(head);
    }
}
