package ADVANCED_DSA.BinaryTrees.striverSheet;

public class MaxPathSum {
    public static void main(String[] args) {

        TreeNode node = new TreeNode(-10);

        node.left = new TreeNode(9);


        node.left.left = new TreeNode(5);
        node.left.right = new TreeNode(6);

        node.left.left.left = new TreeNode(8);
        node.left.left.right = new TreeNode(9);


        node.right = new TreeNode(20);
        node.right.right = new TreeNode(7);
        node.right.left = new TreeNode(15);
        node.right.right.left = new TreeNode(6);
        node.right.left.left = new TreeNode(10);

        System.out.println(maxPathSum(node));


    }

    static int maxPathSum(TreeNode root) {

        if(root == null){
            return 0;
        }

        int left = helperLeft(root,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
       //int right = helperRight(node);
        return 0;
    }

    static int helperLeft(TreeNode node, int maxL, int maxR, int totalMax){
        if(node.left == null && node.right == null){
            return node.data;
        }
        if(node.left == null || node.right == null){
            return node.data;
        }

        int lh =  helperLeft(node.left,maxL,maxR,totalMax);
        lh += node.data;

        int rh =  helperLeft(node.right,maxL,maxR,totalMax);
        rh += node.data;
        maxL = Math.max(maxL,lh);

        maxR = Math.max(maxR,rh);

        return totalMax = Math.max(maxL,maxR);


    }





}
