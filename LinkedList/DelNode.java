package LinkedList;


public class DelNode {

    static Node1 delHead(Node1 head){
        if(head== null)
        return null;
        else
        return head.next;

    }

    public static void printlist(Node1 head){
        Node1 curr = head;

        while(curr !=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
        }System.out.println();
    }

    public static void main(String args[]) 
    { 
        Node1 head=new Node1(10);
    	head.next=new Node1(20);
    	head.next.next=new Node1(30);
    	printlist(head);
    	head=delHead(head);
	    printlist(head);
    	
    } 

}
