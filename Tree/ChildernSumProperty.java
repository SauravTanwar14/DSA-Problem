package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ChildernSumProperty {

    public static boolean isChildernSumProperty(Node root){

        if(root==null || (root.left==null && root.right==null)) {
            return true;
        }

        int sum=0;
        if(root.left!=null){
            sum+=root.left.data;
        }
        if(root.right!=null){
            sum+=root.right.data;
        }

        if(root.data==sum && isChildernSumProperty(root.left) && isChildernSumProperty(root.right)){
        return true;
        }

        return false;


    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        System.out.println(isChildernSumProperty(root));

        Node root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(2);
        root1.right.left = new Node(1);
        root1.right.right = new Node(2);

        System.out.println(isChildernSumProperty(root1));
    }
}
