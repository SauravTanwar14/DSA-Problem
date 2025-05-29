package LinkedList;

class Node_Middle {

    int data;
    Node_Middle next;

    Node_Middle(int x){
        data=x;
        next=null;
    }
}
public class MiddleofLinkedList {

    //printing the middle of a linkedlist
    static void printMiddle(Node_Middle head){

        if(head==null)
        return;

        Node_Middle slow = head;
        Node_Middle fast = head;

        while(fast != null && fast.next !=null){
            slow =slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
        
    }

    //printing kth node form last using linkedlist approach
    static void printNthNodeFromLast(Node_Middle head,int n){
        int len=0;

        //counting length of linkedlist
        for(Node_Middle curr = head; curr != null;curr=curr.next){
            len++;
        }
        if(len<n)
        return;

        Node_Middle curr=head;

        //running loop until the kth node
        for(int i=1;i<len-n+1;i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
    }

    //finding the kth node form last of linked using two pointer approach
    static void printNthNodeFromLastTwoPointerApproach(Node_Middle head,int n){

        if(head==null)
        return;

        Node_Middle first=head;
        for(int i=0;i<n;i++){
            if(first==null)
            return;

            first=first.next;
        }

        Node_Middle second=head;
        while(first!=null){
            second = second.next;
            first=first.next;
        }

        System.out.println(second.data);
    }

    public static void main(String[] args) {
        
        Node_Middle head = new Node_Middle(10);
        head.next = new Node_Middle(20);
        head.next.next = new Node_Middle(30);
        head.next.next.next = new Node_Middle(40);
        head.next.next.next.next=new Node_Middle(50);
    	printlist(head);
    	System.out.print("Position of element in Linked List: ");
    	printMiddle(head);
        System.out.print("Position of element in Linked List from last: ");
        printNthNodeFromLast(head, 2);
        System.out.print("Position of element in Linked List from last uisng two pointer approach: ");
        printNthNodeFromLastTwoPointerApproach(head, 3);

    }

    public static void printlist(Node_Middle head){
        Node_Middle curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
}
