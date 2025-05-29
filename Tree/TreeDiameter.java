package Tree;

public class TreeDiameter {
    private static int diameter;

    public static int treeDiameter(TreeNode root) {
        diameter = 0;
        height(root);  // Calculate height and update diameter
        return diameter;
    }

    private static int height(TreeNode node) {
        if (node == null) return 0;  // Base case: height of null node is 0

        // Calculate heights of left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Update the diameter
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return the height of the current node
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Driver method to test
    public static void main(String[] args) {
        // Example tree construction
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of the tree is: " + treeDiameter(root));
    }
}

