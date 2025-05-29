package LinkedList;

class Node_Insert{
    int data;
    Node_Insert next;
    Node_Insert(int d){
        data=d;
        next=null;
    }
}
public class CircularLinkedList {

    public static void main(String[] args) {
        Node_Insert head = new Node_Insert(10);
        head.next = new Node_Insert(20);
        head.next.next = new Node_Insert(30);
        head.next.next.next=head;
        printList(head);
    }

    private static void printList(Node_Insert head) {

       if(head==null){
        return;
       }

       System.out.print(head.data+" ");

       for(Node_Insert r=head.next;r!=head;r=r.next){

        System.out.print(r.data+" ");
       }
    }

}
