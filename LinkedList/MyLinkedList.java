package LinkedList;

public class MyLinkedList {

    Node1 insertAtPos(Node1 head, int x, int pos){
        Node1 temp = new Node1(x);

        if(head==null)
        {
            if(pos==1){
                return temp;
            }else
            return head;
        }

        if (pos == 1) {
            temp.next = head;
            return temp;
        }

        Node1 curr = head;

        for(int i=1;i<pos-1;i++){

            curr = curr.next;

            if (curr == null) {
                System.out.println("Position out of range");
                return head;
            }

        }
        temp.next = curr.next;
        curr.next= temp;

        return head;
    }
    static void printlist(Node1 head) {
        Node1 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        MyLinkedList ll = new MyLinkedList();
        ll.printlist(head);
        head = ll.insertAtPos(head, 25, 2);
        ll.printlist(head);
    }
}
