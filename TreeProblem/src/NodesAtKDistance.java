public class NodesAtKDistance {

    static void printkNode(Node node,int k){

        if(node==null)
            return;

        if(k==0)
            System.out.print(node.data+" ");

        else {
            printkNode(node.left,k-1);
            printkNode(node.right,k-1);
        }

    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        root.right.right.right=new Node(80);

        int k=3;
        printkNode(root,k);
    }
}
