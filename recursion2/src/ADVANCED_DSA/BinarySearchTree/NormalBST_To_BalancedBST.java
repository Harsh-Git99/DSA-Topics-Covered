package ADVANCED_DSA.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class NormalBST_To_BalancedBST {
    public static void main(String[] args) {

        Node node = new Node(4);
        node.right = new Node(3);
        node.right.right = new Node(2);
        node.right.right.right = new Node(1);

        System.out.println(buildBalancedTree(node).data);

    }

    static Node buildBalancedTree(Node root)
    {


        //get a Inorder of given bst
        List<Integer> list = getInorder(root);

        Node newNode = getbalancedBst ( list ,  0,  list.size()-1);

        return newNode;
    }

    static List<Integer> getInorder(Node root){
        if(root.left == null & root.right == null){
            List<Integer> list = new ArrayList<>();
            list.add(root.data);
            return list;
        }

        List<Integer> list = new ArrayList<>();
        if(root.left != null) list.addAll(getInorder(root.left));
        list.add(root.data);
        if(root.right != null) list.addAll(getInorder(root.right));


        return list;
    }

    static Node getbalancedBst (List<Integer> list , int st, int end){
        if(st > end){
            return null;
        }

        int mid = (st + end)/2;

        Node node = new Node(list.get(mid));

        node.left = getbalancedBst(list, st, mid-1);
        node.right = getbalancedBst(list, mid+1, end);

        return node;
    }
}
