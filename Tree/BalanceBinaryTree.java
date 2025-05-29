package Tree;

public class BalanceBinaryTree {
    public static int isBalanced(TreeNode root) {
      if(root == null) return 0;

      int left = isBalanced(root.left);

      if(left == -1) return -1;

      int right = isBalanced(root.right);

      if(right == -1) return -1;

      if(Math.abs(left - right) > 1) return -1;

      return 1 + Math.max(left, right);

    }
}
