package ADVANCED_DSA.BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinOfBST {
    public static void main(String[] args) {
        Node node = new Node(8);

        node.left = new Node(3);
        node.right = new Node(10);

        node.left.left = new Node(1);
        node.left.right = new Node(6);

        node.left.right.right = new Node(7); //
        node.left.right.left = new Node(5);

        node.right.right = new Node(14);
        node.right.right.left = new Node(13);



        System.out.println(minValue(node));
    }

    static  int  minValue(Node node) {
        if(node.left == null ){
            return  node.data;
        }
        return minValue(node.left);
    }


}
