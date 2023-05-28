package ADVANCED_DSA.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class InsertIntoBST {
    public static void main(String[] args) {
        Node node = new Node(4);

        node.left = new Node(2);
        node.right = new Node(7);

        node.left.left = new Node(1);
        node.left.right = new Node(3);

//        node.left.right.right = new Node(7); //
//        node.left.right.left = new Node(4);
//
//        node.right.right = new Node(14);
//        node.right.right.left = new Node(13);

       // System.out.println(findFloor(node,5).data);

        System.out.println(insertIntoBST(node,5));

        System.out.println(inOrder(node));

    }

    static List<Integer> inOrder(Node node){
        if(node.right == null&& node.left == null){
           List<Integer> list = new ArrayList<>();
           list.add(node.data);
           return list;
        }
        List<Integer> list = new ArrayList<>();

        if(node.left!= null) list.addAll(inOrder(node.left));
        if(node!=null) list.add(node.data);
        if(node.right!= null)list.addAll(inOrder(node.right));
        return list;

    }

    static Node insertIntoBST(Node root, int val) {

        Node node = root;
        Node newNode = new Node(val);
        //find floor of the given Val
        Node floorNode = findFloor(node,val);

        newNode.right = floorNode.right;
        floorNode.right = newNode;
        return root;
    }


    static Node findFloor(Node node, int val){
        Node ans = node;
        while (node!= null){
            if(val < node.data ){
                node = node.left;
            }else if(val > node.data){
                ans = node;
                node = node.right;
            }
        }
        return ans;
    }

}
