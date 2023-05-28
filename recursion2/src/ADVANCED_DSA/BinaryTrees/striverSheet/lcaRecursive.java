package ADVANCED_DSA.BinaryTrees.striverSheet;

public class lcaRecursive {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-1);

        root.left = new TreeNode(0);
        root.right = new TreeNode(3);
//
        root.left.left = new TreeNode(-2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(8);

        System.out.println(lowestCommonAncestor(root,root.left.left,root.left.left.left).data);
    }

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left == null)return right;
        else if(right == null) return left;

        else{
            return root;
        }

    }
}
