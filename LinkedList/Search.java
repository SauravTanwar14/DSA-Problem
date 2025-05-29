package LinkedList;

public class Search {

    public static void main(String[] args) {
        
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        printlist(head);
    	System.out.println("Position of element in Linked List: "+search(head,20));
    }

    public static void printlist(Node1 head){
        Node1 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }

    private static int search(Node1 head, int x) {
       int pos=1;
       Node1 curr = head;

       while (curr != null) {

        if(curr.data == x){
            return pos;
        }else{
            pos++;
            curr=curr.next;
        }
        
       }
       return -1;
    }

}
