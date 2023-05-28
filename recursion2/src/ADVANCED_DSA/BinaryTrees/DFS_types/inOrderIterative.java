package ADVANCED_DSA.BinaryTrees.DFS_types;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inOrderIterative {
    public static void main(String[] args) {
        NodeClass root = new NodeClass(1);

        root.left = new NodeClass(2);
        root.right = new NodeClass(3);

        root.left.left = new NodeClass(4);
        root.left.right = new NodeClass(5);

        root.left.right.left = new NodeClass(6);

        root.right.left = new NodeClass(7);
        root.right.right = new NodeClass(8);

        root.right.right.left = new NodeClass(9);
        root.right.right.right = new NodeClass(10);

        System.out.println(inOrder(root));
    }

    static List<Integer> inOrder(NodeClass node){

        Stack<NodeClass> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.peek();
                list.add(stack.pop().data);
                node=node.right;
            }
        }
    return list;
    }
}
