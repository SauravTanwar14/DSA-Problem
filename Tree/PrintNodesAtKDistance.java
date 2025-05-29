package Tree;

public class PrintNodesAtKDistance {

    static void printKNodes(Node node, int k) {

        if (node == null || k < 0) {
            return;
        }

        if (k == 0) {
            System.out.print(node.data + " ");
            return;
        }

        printKNodes(node.left, k - 1);
        printKNodes(node.right, k - 1);
    }

    public static void main(String[] args) {

        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(8);

       printKNodes(node,2);
    }
}
