package LinkedList;

/*
*Key Idea: Floyd’s Cycle Detection
Use two pointers: slow and fast

Move slow by 1 step, fast by 2 steps

If there's a cycle → they will meet

Once they meet:

Reset one pointer to head

Move both one step at a time

They will meet at the cycle start

🔄 Why It Works?
When slow and fast meet inside the cycle:

Let’s say:

L = distance from head to cycle start

C = cycle length

They meet after L + x steps

Reset one pointer to head, and move both by 1 step

They meet at cycle start in L steps
* */
public class DetectCycleStart {
    public static ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                ListNode entery = head;

                while(entery != slow){
                    slow = slow.next;
                    entery = entery.next;
                }
                return entery;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next;    // creates a cycle

        ListNode cycleStart = detectCycle(head);
        System.out.println("Cycle start: " + cycleStart.val);
    }
}
