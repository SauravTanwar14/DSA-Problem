package Tree;

public class HeightTree {

    public static int height(Node node) {

        if (node == null) {
            return 0;
        } else {
            int lside = height(node.left);
            int rside = height(node.right);

            if (lside > rside)
                return lside + 1;
            else
                return rside + 1;
        }
    }

    public static void main(String[] args) {
        
        Node node = new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        System.out.println("height of tree "+ height(node));
    }

}
