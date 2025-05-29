import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    Node root;

    void printLevelTraversal(){
        Queue<Node> queue =new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.print(tempNode.data+" ");

            if(tempNode.left!=null){
                queue.add(tempNode.left);
            }

            if (tempNode.right!=null){
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {

        LevelOrderTraversal lvl = new LevelOrderTraversal();

         lvl.root = new Node(1);
        lvl.root.left = new Node(2);
        lvl.root.right = new Node(3);
        lvl.root.left.left = new Node(4);
        lvl.root.left.right = new Node(5);

        lvl.printLevelTraversal();
    }
}
