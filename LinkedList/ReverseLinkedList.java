package LinkedList;

class NodeReverse{
    int data;
    NodeReverse next;

    NodeReverse(int x){
        data = x;
        next = null;
    }
}
public class ReverseLinkedList {

    //reversing linkedlist using Iterative approach
    public static NodeReverse reverseLinkedListIterative(NodeReverse head){

        NodeReverse prev = null;
        NodeReverse current = head;
        NodeReverse next= null;

        while(current!=null){
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current node
            current = next; // Move current to next node
        }

        return prev;
    }

    //reversing linkedlist using Recursive approach
    public static NodeReverse reverseListRecursive(NodeReverse head) {
        if (head == null || head.next == null) {
            return head; // Base case: Empty or single node list
        }

        NodeReverse newHead = reverseListRecursive(head.next); // Reverse the rest of the list
        head.next.next = head; // Point the next node back to the current node
        head.next = null; // Break the current node's next pointer

        return newHead;
    }

    public static void printList(NodeReverse head) {
        NodeReverse temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        NodeReverse head = new NodeReverse(1);
        head.next = new NodeReverse(2);
        head.next.next = new NodeReverse(3);
        head.next.next.next = new NodeReverse(4);

        System.out.println("Original Linked List:");
        printList(head);

        head = reverseLinkedListIterative(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
