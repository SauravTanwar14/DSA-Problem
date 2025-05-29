package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLineByLine {

    public static void printLevelOrderLineByLine(TreeNode root){

        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(queue.size()>1){
            TreeNode curr = queue.poll();

            if(curr==null){
                System.out.println();
                queue.add(null);
                continue;
            }
            System.out.print(curr.value+" ");

            if(curr.left!=null) queue.add(curr.left);
            if(curr.right!=null) queue.add(curr.right);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        printLevelOrderLineByLine(root);
    }
}
