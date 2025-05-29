package LinkedList;

public class DelLastNode {
    static Node1 delNode(Node1 head){

        if(head == null){
            return null;
        }

        if(head.next == null){
            return null;
        }

        Node1 curr = head;

        while(curr.next.next != null){

            curr = curr.next;
        }

        curr.next = null;

        return head;
    }
    public static void main(String args[]) 
    { 
        Node1 head=new Node1(10);
    	head.next=new Node1(20);
    	head.next.next=new Node1(30);
    	printlist(head);
    	head=delNode(head);
	    printlist(head);
    	
    } 
    public static void printlist(Node1 head){
        Node1 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }

}
