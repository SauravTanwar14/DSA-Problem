package LinkedList;



//Insert at Begin of Singly Linked List

class LinkedList{

    Node1 head;

    public void insertAtBegin(int data){
        Node1 newNode = new Node1(data);
        newNode.next = head;
        head= newNode;
    }

    public void printList(){
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class InsertAtBegining {

   public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertAtBegin(10);
    list.insertAtBegin(20);
    list.insertAtBegin(30);
    list.insertAtBegin(40);
    System.out.print("Linked List: ");
        list.printList();
   }


}
