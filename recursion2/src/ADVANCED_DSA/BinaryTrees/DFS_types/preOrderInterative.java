package ADVANCED_DSA.BinaryTrees.DFS_types;

import java.util.Stack;

public class preOrderInterative {
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

        preOrderIterative(root);


    }

    static void preOrderIterative(NodeClass node){
        Stack<NodeClass> stack = new Stack<>();

        stack.push(node);

        while(!stack.isEmpty()){
            NodeClass root = stack.pop();
            System.out.print(root.data+" ");
            if(root.right != null) stack.push(root.right);
            if(root.left != null) stack.push(root.left);
        }
    }
}
