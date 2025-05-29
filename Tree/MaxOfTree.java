package Tree;

public class MaxOfTree {
 
    public static int findMax(TreeNode root){

        if(root == null){
            return 0;
        }

        int rightMax = findMax(root.right);
        int leftMax = findMax(root.left);

        int ans = Math.max(root.value, Math.max(rightMax, leftMax));
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);

        // Count nodes using recursive method
        System.out.println("max of tree is : " + findMax(root));
    }
}
