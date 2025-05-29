package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void levelOrderPrint(TreeNode root){

        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<queueSize;i++){
                TreeNode current = queue.poll();
                list.add(current.value);

                if(current.right !=null){
                    queue.add(current.right);
                }

                if(current.left != null){
                    queue.add(current.left);
                }
            }
            System.out.print(list+" ");
            
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("Level-wise Printing:");
        levelOrderPrint(root);
    }
}
