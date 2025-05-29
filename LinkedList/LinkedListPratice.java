package LinkedList;

class Noode {
    int data;
    Noode next;

    Noode(int x) {
        data = x;
        next = null;
    }
}

public class LinkedListPratice {

    public static void main(String[] args) {

        Noode head = new Noode(1);
        head.next = new Noode(2);
        head.next.next = new Noode(3);
        head.next.next.next = new Noode(4);

        System.out.println("inserting a new node at beginning of list");
        head = insertAtBegin(head, 99);
        printNode(head);

        System.out.println("inserting a new node at speific positioin of list");
        head = insertAtPosition(15, head, 3);

        printNode(head);

        System.out.println("deleting node form list");
        head = delNode(head);
        printNode(head);

        System.out.println("deleting node form list at sepicfic position");
        head = delNodeAtPosition(head,2);
        printNode(head);

        System.out.println("deleting node form last position");
        head = delNodeLast(head);
                printNode(head);
        
            }
        
            //deleting node form last position
            private static Noode delNodeLast(Noode head) {
                Noode temp = head;
                Noode secondLast = null;

                while(temp.next!=null){
                    secondLast = temp;
                    temp = temp.next;
                }
                secondLast.next=null;

                return head;
            }
        
            // deleting node form list at sepicfic position
    private static Noode delNodeAtPosition(Noode head,int pos) {

        Noode temp = head;

        for(int i=0;i<pos-2;i++){
            temp=temp.next;
        }

        Noode delNoode = temp.next;
        temp.next = delNoode.next;

        return head;
    }

    // deleting node form linkedlist
    private static Noode delNode(Noode head) {

        if (head == null)
            return null;
        else
            return head.next;
    }

    // insert new node at specfic postion
    private static Noode insertAtPosition(int x, Noode node, int pos) {
        Noode newNode = new Noode(x);
        Noode temp = node;
        for (int i = 0; i < pos - 2; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return node;
    }

    // inserting node at begin
    private static Noode insertAtBegin(Noode node, int x) {

        Noode newnode = new Noode(x);
        newnode.next = node;
        node = newnode;

        return node;
    }

    // for printing nodes of linkedlist
    private static void printNode(Noode head) {
        Noode curr = head;

        while (curr != null) {

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.err.println();
    }
}
