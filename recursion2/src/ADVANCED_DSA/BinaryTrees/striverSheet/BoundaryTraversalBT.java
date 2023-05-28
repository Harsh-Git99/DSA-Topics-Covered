package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.ArrayList;
import java.util.Collections;

public class BoundaryTraversalBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(10);
        //root.right = new TreeNode(3);

        root.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);

        root.left.left.right.left = new TreeNode(8);
        root.left.left.right.left.left = new TreeNode(11);
        root.left.left.right.left.left.left = new TreeNode(3);
        root.left.left.right.left.left.left.left = new TreeNode(5);
        root.left.left.right.left.left.left.right = new TreeNode(8);

        root.left.left.right.right = new TreeNode(8);
        root.left.left.right.right.left = new TreeNode(3);
        root.left.left.right.right.left.left = new TreeNode(8);
        root.left.left.right.right.left.right = new TreeNode(6);

        root.left.left.right.right.right = new TreeNode(4);
        root.left.left.right.right.right.right = new TreeNode(11);




        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(7);
        root.left.right.left.right = new TreeNode(8);
        root.left.right.left.right.right = new TreeNode(1);
        root.left.right.left.right.right.left = new TreeNode(11);



        System.out.println(boundary(root));

    }

    static ArrayList<Integer> boundary(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( leftBoundary(root));

        list.addAll( leafBoundary(root));

        list.addAll( reverseRightBoundary(root));
        return list;
    }

    //for Left Boundary nodes

    static ArrayList<Integer> leftBoundary(TreeNode node){

        if(node.left == null)return new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();


        while(node.left != null){
            list.add(node.data);
            node = node.left;
        }
        if(node.right != null && node.right.left != null || node.right.right !=null) list.add(node.data);

        return list;
    }

    //leaf Boundary

    static ArrayList<Integer> leafBoundary(TreeNode node){
        if(node.left == null && node.right ==null){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }
        if(node.left == null){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(leafBoundary(node.right));
            return list;
        }
        if(node.right == null){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(leafBoundary(node.left));
            return list;
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(leafBoundary(node.left));
        list.addAll(leafBoundary(node.right));

        return list;

    }

    //reverse Right boundary
    static ArrayList<Integer> reverseRightBoundary(TreeNode node){
        if(node.right == null)return new ArrayList<>();
        if(node.right != null){
            node = node.right;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(node.right!= null){
            list.add(node.data);
            node=node.right;
        }
        Collections.reverse(list);
        return list;
    }


}
