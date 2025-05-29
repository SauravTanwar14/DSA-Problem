package LinkedList;

public class InsertedInSortedLinkedList {

    static NodeSorted sortedInsert(NodeSorted head,int x){
        NodeSorted newNode = new NodeSorted(x);
        NodeSorted curr;
        if(head==null ||  head.data >= x){
            newNode.next = head;
            return newNode;
        }
        curr = head;
        while(curr.next !=null && curr.next.data<x){
            curr = curr.next;
        }    
        newNode.next = curr.next;
        curr.next= newNode;
        return head;
    }

    public static void main(String[] args) {
        NodeSorted head = new NodeSorted(10);
        head.next = new NodeSorted(20);
        head.next.next = new NodeSorted(30);

        System.out.println("Original List:");
        printList(head);  // Output: 10 20 30

        head = sortedInsert(head, 15);  // Inserting 15
        System.out.println("After inserting 15:");
        printList(head);  // Output: 10 15 20 30

        head = sortedInsert(head, 5);   // Inserting 5
        System.out.println("After inserting 5:");
        printList(head);  // Output: 5 10 15 20 30

        head = sortedInsert(head, 35);  // Inserting 35
        System.out.println("After inserting 35:");
        printList(head);  // Output: 5 10 15 20 30 35
    }

     // Method to print the linked list
     public static void printList(NodeSorted head) {
        NodeSorted current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
