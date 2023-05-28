package ADVANCED_DSA.BinaryTrees.striverSheet;

public class diameterOfBT {
    public static void main(String[] args) {

         TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
//        root.left = new TreeNode(-7);
//
//        //root.left.left = new TreeNode(4);
////        root.left.right = new TreeNode(5);
////        root.left.right.right = new TreeNode(7);
////        root.left.right.right.right = new TreeNode(8);
////
//        root.right.left = new TreeNode(-9);
//        root.right.right=new TreeNode(-3);
//
//        root.right.left.left = new TreeNode(9);
//        root.right.left.right=new TreeNode(-7);
//
//        root.right.left.left.left = new TreeNode(6);
//        root.right.left.left.left.left = new TreeNode(0);
//        root.right.left.left.left.left.left = new TreeNode(-1);
//
//        root.right.left.right.right=new TreeNode(-6);
//        root.right.left.right.right.right=new TreeNode(9);
//        root.right.left.right.right.right.right=new TreeNode(-2);
//
//        root.right.left.right.left=new TreeNode(-6);
//        root.right.left.right.left.left=new TreeNode(5);
//
//
//        root.right.right.left=new TreeNode(-4);



        System.out.println(diameterOfBinaryTree(root));
    }

    static int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        int h =  height(root,max);


        return max[0];

    }

   // static int maxlength = Integer.MIN_VALUE;

    static int height (TreeNode root, int[] maxi){
        if(root == null) return 0;

        int lh = height(root.left,maxi);
        int rh = height(root.right,maxi);

        maxi[0] = Math.max(maxi[0],(lh+rh));

         return Math.max(lh,rh)+1;


    }
}
