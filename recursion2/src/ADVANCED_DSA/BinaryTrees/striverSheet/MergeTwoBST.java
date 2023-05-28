package ADVANCED_DSA.BinaryTrees.striverSheet;

import ADVANCED_DSA.BinarySearchTree.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoBST {
    public static void main(String[] args) {

        TreeNode node = new TreeNode(5);

        node.left = new TreeNode(3);
        node.right = new TreeNode(6);

        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(4);

//        node.left.right.right = new TreeNode(7); //
//        node.left.right.left = new TreeNode(4);
//
//        node.right.right = new TreeNode(14);
//        node.right.right.left = new TreeNode(13);

        TreeNode root = new TreeNode(2);

        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(6);

        System.out.println(merge(node,root));



    }

    static List<Integer> merge(TreeNode root1, TreeNode root2)
    {
        // Write your code here
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = getAllNodes(root1);

        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        List<Integer> list3 = getAllNodes(root2);

        for (int i = 0; i < list3.size(); i++) {
            list1.add(list3.get(i));
        }

        Collections.sort(list1);
        return list1;

    }
//
    static   List<Integer> getAllNodes(TreeNode node){
        if(node.right == null&& node.left == null){
            List<Integer>list = new ArrayList<>();
            list.add(node.data);
            return list;
        }
        List<Integer>list = new ArrayList<>();

        if(node.left != null) list.addAll( getAllNodes(node.left));
        list.add(node.data);
        if(node.right!=null) list.addAll( getAllNodes(node.right));

        return list;
    }
}
