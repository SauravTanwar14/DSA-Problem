package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralTraversal {

    static void printSpiral(Node root) {
        if (root == null)
            return;

        Stack<Node> s1 = new Stack<>(); // Left to Right
        Stack<Node> s2 = new Stack<>(); // Right to Left

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            while (!s1.isEmpty()) {
                Node temp = s1.pop();
                System.out.print(temp.data + " ");

                // Push left then right into s2 (for right-to-left)
                if (temp.right != null)
                    s2.push(temp.right);
                if (temp.left != null)
                    s2.push(temp.left);

            }

            while (!s2.isEmpty()) {
                Node temp = s2.pop();
                System.out.print(temp.data + " ");

                // Push right then left into s1 (for left-to-right)
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);

            }
        }
    }

    //better approach handling all the testcases
    public ArrayList<Integer> findSpiral(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = false; // Start with Right to Left as per common spiral convention

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();

            // Collect nodes at current level
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                currentLevel.add(node.data);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            // Add to result in spiral order
            if (leftToRight) {
                result.addAll(currentLevel);
            } else {
                for (int i = currentLevel.size() - 1; i >= 0; i--) {
                    result.add(currentLevel.get(i));
                }
            }

            leftToRight = !leftToRight; // toggle direction
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);

        System.out.println("Spiral Order traversal:");
        printSpiral(root);
    }
}
