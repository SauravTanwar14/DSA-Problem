package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfBinaryTree {

    public static int widthOfTree(TreeNode root){

        int res = 0;

        if(root==null)
            return 0;


        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
           int count = queue.size();;
            res = Math.max(res,count);

            for(int i=0;i<count ;i++){
                TreeNode current = queue.poll();

                if(current.left!=null)
                    queue.add(current.left);

                if(current.right!=null)
                    queue.add(current.right);
            }


        }
        return  res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(widthOfTree(root));
    }
}
