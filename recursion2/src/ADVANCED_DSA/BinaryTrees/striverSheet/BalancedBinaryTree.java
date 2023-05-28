package ADVANCED_DSA.BinaryTrees.striverSheet;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(5);
        root.left = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);


        System.out.println( isBoolean(root));
    }

    static boolean isBoolean(TreeNode root){

        return height(root) != -1;
    }

    static int height(TreeNode root) {

        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        if(lh ==-1) return -1;
        int rh = height(root.right);
        if(rh ==-1) return -1;

        if(Math.abs(lh-rh)>1)return -1;

        return Math.max(lh,rh)+1;

    }
}
