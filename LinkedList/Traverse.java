package LinkedList;

public class Traverse {

    public static void printNode(Node1 head){
        Node1 curr = head;
        while(curr!= null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        Node1 head=new Node1(10);
    	head.next=new Node1(20);
    	head.next.next=new Node1(30);
    	head.next.next.next=new Node1(40);
    	printNode(head);
    }

}
