package ADVANCED_DSA.BinaryTrees.DFS_types;

import ADVANCED_DSA.BinarySearchTree.Node;


import java.util.ArrayList;
import java.util.List;

public class morrisTraversalOfInOrder {
    public static void main(String[] args) {
//        NodeClass root = new NodeClass(1);
//
//        root.left = new NodeClass(2);
//        root.right = new NodeClass(3);
//
//        root.left.left = new NodeClass(4);
//        root.left.right = new NodeClass(5);
//
//        root.left.right.left = new NodeClass(6);
//
//        root.right.left = new NodeClass(7);
//        root.right.right = new NodeClass(8);
//
//        root.right.right.left = new NodeClass(9);
//        root.right.right.right = new NodeClass(10);


        NodeClass root = new NodeClass(8);

        root.left = new NodeClass(6);
        root.right = new NodeClass(9);

        root.left.left = new NodeClass(4);
        root.left.right = new NodeClass(5);

        root.left.right.right = new NodeClass(7);

//        root.right.left = new NodeClass(7);
        root.right.right = new NodeClass(10);
//
//        root.right.right.left = new NodeClass(9);
//        root.right.right.right = new NodeClass(10);

        System.out.println(inOrderMorris(root));

    }

    static List<Integer> inOrderMorris(NodeClass root){
        List<Integer> list = new ArrayList<>();
        NodeClass curr =root;
        while (curr != null){
            if(curr.left == null){
                list.add(curr.data);
                curr = curr.right;
            }
            else {
                NodeClass prev = curr.left;
                while(prev.right!=null && prev.right!=curr){
                    prev=prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }
                else {
                    prev.right = null;
                    list.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return list;
    }
}
