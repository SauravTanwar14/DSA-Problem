package Tree;

import java.util.ArrayList;
import java.util.List;

public class AllPathSum {

    public List<List<Integer>> pathSum(TreeNode root, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPaths(root, target, currentPath, result);
        return result;
    }

    private void findPaths(TreeNode node, int target, List<Integer> currentPath, List<List<Integer>> result) {

        if (node == null)
            return;

        //// Add the current node to the path
        currentPath.add(node.value);

        // If it's a leaf node and the target sum is reached, add the path to the result
        if (node.left == null && node.right == null && target == node.value) {
            result.add(new ArrayList<>(currentPath)); // Add the current path to result
        } else {
            // Continue exploring the left and right subtrees with the reduced target sum
            findPaths(node.left, target - node.value, currentPath, result);
            findPaths(node.right, target - node.value, currentPath, result);
        }

        // Backtrack by removing the current node from the path
        currentPath.remove(currentPath.size() - 1);
    }

     // Main method for testing
     public static void main(String[] args) {
        AllPathSum  solution = new AllPathSum ();
        
        // Constructing a sample binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        
        int target = 22;
        List<List<Integer>> paths = solution.pathSum(root, target);
        
        // Print the paths
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
