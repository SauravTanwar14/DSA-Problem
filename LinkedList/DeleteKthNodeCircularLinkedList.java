package LinkedList;

class NodeKdelete{
    int data;
    NodeKdelete next;

    NodeKdelete(int x){
        data=x;
        next=null;
    }
}
public class DeleteKthNodeCircularLinkedList {

    static NodeKdelete deleteKthNode(NodeKdelete head,int k){

        if(head==null){
            return head;
        }

        if(k==1){
            return deleteHead(head);
        }

        NodeKdelete curr = head;

        for(int i=0;i<k-2;i++){
            curr=curr.next;
        }

        curr.next = curr.next.next;

        return head;

    }

    static NodeKdelete deleteHead(NodeKdelete head){
        if(head==null)return null;
        if(head.next==head)
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }

    public static void main(String[] args) {
   
        NodeKdelete head = new NodeKdelete(10);
        head.next = new NodeKdelete(20);
        head.next.next = new NodeKdelete(30);
        head.next.next.next = new NodeKdelete(40);
        head.next.next.next.next = head;
        head = deleteKthNode(head, 3);
        printlist(head);
        
    }
    public static void printlist(NodeKdelete head){
        if(head==null)return;
        NodeKdelete r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
}
