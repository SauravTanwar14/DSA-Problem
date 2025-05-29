package Tree;

public class CountNode {

    public static int countNodesRecursive(TreeNode root){
        if(root == null)
        return 0;

        int l = countNodesRecursive(root.left);
        int r = countNodesRecursive(root.right);

        int ans = l+r+1;
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Count nodes using recursive method
        System.out.println("Number of nodes (recursive): " + countNodesRecursive(root));
    }
}
