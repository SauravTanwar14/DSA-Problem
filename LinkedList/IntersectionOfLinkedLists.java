package LinkedList;

public class IntersectionOfLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        // Calculate lengths of both lists
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        // Align both pointers
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Traverse both lists to find intersection
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA; // Intersection point
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null; // No intersection
    }

    private static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(9);
        headA.next.next.next = common;

        ListNode headB = new ListNode(4);
        headB.next = common;

        ListNode intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}

