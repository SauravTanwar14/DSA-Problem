package LinkedList;

public class CycleDectectAndRemove {
    public static void deleteCycleRemove(Node head) {
        Node slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(slow != fast){
            return;
        }
        slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;


    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " → ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head.next.next;

        deleteCycleRemove(head);
        printList(head);
    }
}
