package ADVANCED_DSA.BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class kthSmallestElement {
    public static void main(String[] args) {

        Node node = new Node(5);
        node.left = new Node(3);
        node.right = new Node(6);
        node.left.left = new Node(2);
//
        node.left.right = new Node(4);
//
//        node.right.right = new Node(13);
//        node.right.left = new Node(10);
//
//
        node.left.left.left = new Node(1);
//        node.left.left.right = new Node(3);
//        node.left.left.right.right = new Node(4);
//
//        node.left.right.right = new Node(8);
//        node.left.right.left = new Node(6);


       // System.out.println(findkth(node,1));

        System.out.println(kthSmallest(node,3));

    }

    static int kthSmallest(Node root, int k) {

        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while(true){

            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                root = stack.peek();
                list.add(stack.pop().data);
                root = root.right;
            }
            if(list.size() == k) return list.get(k-1);

        }
        return list.get(k-1);
    }




    //brute force
    static int findkth(Node node, int key){

        List<Integer> list = traverse(node);

        Collections.sort(list);

        return list.get(key-1);

    }


    static List<Integer>  traverse(Node node ){

        if(node.left == null && node.right == null){
            List<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }
        List<Integer> list = new ArrayList<>();
        if(node.left!= null) list.addAll(traverse(node.left));
        list.add(node.data);
        if(node.right!= null) list.addAll(traverse(node.right));

        return list;
    }
}
