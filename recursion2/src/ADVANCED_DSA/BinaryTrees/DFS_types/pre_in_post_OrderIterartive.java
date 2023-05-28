package ADVANCED_DSA.BinaryTrees.DFS_types;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;





public class pre_in_post_OrderIterartive {
    public static void main(String[] args) {

        NodeClass node = new NodeClass(1);

        node.left = new NodeClass(2);
        node.left.left = new NodeClass(3);
        node.left.right = new NodeClass(4);

        node.right = new NodeClass(5);
        node.right.left = new NodeClass(6);
        node.right.right = new NodeClass(7);


    }

//    static void PreInPostIterative(NodeClass root){
//
////        Stack<Pair> stack = new Stack<Pair>();
////        stack.push(new Pair(root,1));
////
////        List<Integer> pre = new ArrayList<>();
////        List<Integer> in = new ArrayList<>();
////        List<Integer> post = new ArrayList<>();
////
////        if(root == null) return;
////
////        while (!stack.isEmpty() ){
////
////            Pair it = stack.pop();
////
////            if(it. == 1){
//
//            }
//        }
//
//    }
}
