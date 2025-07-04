package Tree;

public class SumRootToLeaf {

    // Main function to calculate the sum of all root-to-leaf numbers
    public int sumNumbers(TreeNode root){
        return dfs(root,0);
    }

    // Helper function to perform DFS traversal
    private int dfs(TreeNode node, int currentSum){

        if(node == null){
            return 0;
        }

        //update the currentsum
        currentSum = currentSum * 10+ node.value;

        if(node.left == null && node.right == null){
            return currentSum;
        }

        int leftSum = dfs(node.left, currentSum);
        int rightSum = dfs(node.right, currentSum);

        return leftSum+ rightSum;
    }

    // Sample tree and test case
    public static void main(String[] args) {
        // Constructing a sample binary tree:
        //        1
        //       / \
        //      2   3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        SumRootToLeaf solution = new SumRootToLeaf();
        int result = solution.sumNumbers(root);
        System.out.println("Sum of root-to-leaf numbers: " + result);  // Output: 25 (12 + 13)
    }
}
