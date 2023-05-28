package ADVANCED_DSA.BinaryTrees.striverSheet;

public class ChildrenSumParent {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(10);
//        root.right = new TreeNode(4);
//
//
//        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(1);
//
//        root.left.left.left = new TreeNode(2);
//        root.left.left.right = new TreeNode(3);
//
//
//        root.right.right = new TreeNode(1);
//        root.right.left = new TreeNode(3);


        System.out.println(isSum(root));
    }

    static int isSum(TreeNode root){
        int ans = isSumProperty(root);

        if(ans == root.data){
            return 1;
        }else return 0;
    }

    static int isSumProperty(TreeNode root){
        if(root.left == null && root.right == null){
            return root.data;
        }
        int left = 0;
        int right = 0;
        if(root.left != null)  left = isSumProperty(root.left);


        if(root.right != null) right = isSumProperty(root.right);

        if(root.data == left + right){
            return root.data;
        }
        else return Integer.MIN_VALUE;
    }
}
