package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfTree {

    public static void leftView(TreeNode root) {

        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int queueSize = queue.size();

            for(int i=0;i<queueSize;i++){
                TreeNode currentNode = queue.poll();

                if(i==0){
                    System.out.print(currentNode.value+" ");
                }

                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }

            }
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

        leftView(root);    }
}
