package LinkedList;


public class InsertAtEnd {

    static Node1 insertEnd(Node1 head, int x){
        Node1 temp = new Node1(x);

        if(head == null){
            return temp;
        }

        Node1 curr= head;

        while(curr.next != null){
            curr = curr.next ;
        }
        curr.next=temp;

        return head;

    }

    public static void printlist(Node1 head){
        Node1 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
}

    public static void main(String args[]) 
    { 
        Node1 head=null;
	    head=insertEnd(head,10);
	    head=insertEnd(head,20);
	    head=insertEnd(head,30);
	    printlist(head);
    	
    } 
    


}
