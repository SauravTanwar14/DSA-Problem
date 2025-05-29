package Heap;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class Test {
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        String combined = s1 + s1;
        return combined.contains(s2);
    }

    public static int getMaxWidth(Node root) {
        // Your code here
        if(root == null)return 0;

        if(root.left==null && root.right ==null){
            return 1;
        }

        int maxLevel=0;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);


        while(!queue.isEmpty()){
            int queueSize = queue.size();

            maxLevel = Math.max(maxLevel,queueSize);

            Node curr = queue.poll();

            if(curr.left!=null){
                queue.add(curr.left);
            }

            if(curr.right!=null){
                queue.add(curr.right);
            }

        }
        return maxLevel;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        //System.out.print(areRotations(s1,s2));
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);

        int maxWidth = getMaxWidth(head);
        System.out.print(maxWidth);




    }
}
