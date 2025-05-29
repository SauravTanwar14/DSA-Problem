package LinkedList;


public class InsertBeginCircularLinkedList {

    public static void main(String[] args) {
        Node_Insert head = new Node_Insert(10);
        head.next = new Node_Insert(20);
        head.next.next = new Node_Insert(30);
        head.next.next.next=head;

        head = insertAtBegin(head,5);
       
        printList(head);
    }

    private static Node_Insert insertAtBegin(Node_Insert head,int x) {
        Node_Insert temp = new Node_Insert(x);

        if(head==null){
            temp.next = temp;
        }else{

            Node_Insert curr = head;

            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head;

        }
        return temp;

        
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
