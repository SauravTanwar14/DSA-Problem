package Tree;

public class TreeTraversal {
    //in order traversal
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }

    }

    //pre order traversal
    public void preOrder(TreeNode root) {
        if (root != null){
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    //post order traversal
    public void postOrder(TreeNode root) {
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        TreeTraversal traversal = new TreeTraversal();
        System.out.println("In-order traversal:");
        traversal.inOrder(root);

        System.out.println("\nPre-order traversal:");
        traversal.preOrder(root);

        System.out.println("\nPost-order traversal:");
        traversal.postOrder(root);
    }

}
