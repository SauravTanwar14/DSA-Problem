package LinkedList;

class NodeEvenOdd{

    int data;
    NodeEvenOdd next;

    NodeEvenOdd(int x){
        data = x;
        next = null;
    }
}
public class EvenOddList {

    public static NodeEvenOdd evenOddList(NodeEvenOdd node){
        NodeEvenOdd odd = node;
        NodeEvenOdd even = node.next;
        NodeEvenOdd evenStart = node.next;

        //given a choice between two pointers, always write the condition keeping in mind 
        //the pointer that becomes null first.
        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenStart;
        return node;
    }
    public static void main(String[] args) {
        NodeEvenOdd head = new NodeEvenOdd(1);
        head.next = new NodeEvenOdd(2);
        head.next.next = new NodeEvenOdd(3);
        head.next.next.next = new NodeEvenOdd(4);

        evenOddList(head);
        printNode(head);

    }

    // for printing nodes of linkedlist
    private static void printNode(NodeEvenOdd head) {
        NodeEvenOdd curr = head;

        while (curr != null) {

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.err.println();
    }

}
