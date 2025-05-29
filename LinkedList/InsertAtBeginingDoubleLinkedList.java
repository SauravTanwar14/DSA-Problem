package LinkedList;


public class InsertAtBeginingDoubleLinkedList {

    public static Node1 insertAtBegin(Node1 head,int x){

        Node1 temp = new Node1(x);

        temp.next = head;
        if(head!=null)
        head.prev=temp;
        return temp;
    }

    
    public static void main(String[] args) {
        
        // Creating the first node (head)
        Node1 head = new Node1(10);
        
        // Creating two more nodes
        Node1 temp1 = new Node1(20);
        Node1 temp2 = new Node1(30);

        // Linking nodes together to form a doubly linked list
        head.next = temp1;  // head -> temp1
        temp1.prev = head;  // temp1 <- head
        
        temp1.next = temp2;  // temp1 -> temp2
        temp2.prev = temp1;  // temp2 <- temp1

        head=insertAtBegin(head,5);
        head=insertEnd(head,40);

        // Printing the doubly linked list
        printlist(head);  // Expected output: 10 20 30
    }

    private static Node1 insertEnd(Node1 head, int x) {
        Node1 temp = new Node1(x);

        if(head==null)return temp;

        Node1 curr = head;

        while(curr.next !=null){
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;

        return head;
    }


    // Method to print all nodes in the list starting from the head
    public static void printlist(Node1 head) {
        Node1 curr = head;  // Start from the head
        while (curr != null) {
            System.out.print(curr.data + " ");  // Print the data of the current node
            curr = curr.next;  // Move to the next node
        }
        System.out.println();  // Print a new line after the list
    }

}
