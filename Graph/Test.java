package Graph;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class Test {

    public static int bfs(TreeNode root,int k){
        int result = -1;

        while (root != null) {
            if (root.val == k) {
                return root.val;
            } else if (root.val < k) {
                result = root.val; // potential candidate
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return result;
    }
}

