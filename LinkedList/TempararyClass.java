package LinkedList;


public class TempararyClass {
    public Node middleNode(Node head) {

        if(head==null){
            return head;
        }
        Node slow = head;
        Node fast = head;

        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static Node insertNode(Node head,int x){
        if(head==null)
            return head;

        Node temp = new Node(x);
        Node curr = head;

        while(curr.next!=null){
            curr= curr.next;
        }
        curr.next = temp;


        return head;
    }

    public static void printNode(Node head){

        Node curr = head;
        //System.out.print(curr.data+" ");
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static Node deleteNode(Node head){
        if(head==null)
            return head;

        Node prev=null;

        Node curr = head;

        while(curr.next!=null){
            prev=curr;
            curr= curr.next;
        }

        prev.next = null;

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);

        head = insertNode(head,25);

        printNode(head);

        System.out.println();
        System.out.println("Delete operation");
        head = deleteNode(head);

        printNode(head);
    }
}
