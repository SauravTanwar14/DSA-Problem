package Tree;

public class CountFullNodes {

    public static int countFullNodes(TreeNode root){
        if(root == null)
        return 0;

        int count =0;
        if(root.left == null && root.right == null){
            count =1;
        }

        int r = countFullNodes(root.right);
        int l = countFullNodes(root.left);
        int ans = count+ l+r;
        

        

        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("Number full nodes: " + countFullNodes(root)); 
    }
}
