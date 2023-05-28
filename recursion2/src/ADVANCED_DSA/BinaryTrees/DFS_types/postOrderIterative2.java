package ADVANCED_DSA.BinaryTrees.DFS_types;

import java.util.Stack;

public class postOrderIterative2 {
    public static void main(String[] args) {
        NodeClass root = new NodeClass(1);

        root.left = new NodeClass(2);
        root.right = new NodeClass(7);

        root.left.left = new NodeClass(3);
        //root.left.left.left = new NodeClass(3);

        root.left.left.right = new NodeClass(4);
        root.left.left.right.right = new NodeClass(5);
        root.left.left.right.right.right = new NodeClass(6);

        root.right.left = new NodeClass(8);
        root.right.right = new NodeClass(9);

        //root.right.right.left = new NodeClass(9);
        root.right.right.right = new NodeClass(10);

        postOrder(root);
    }

    static void postOrder(NodeClass curr){
        Stack<NodeClass> stack =new Stack<>();
        while(!stack.isEmpty() || curr != null ){
            if(curr != null){
                stack.push(curr);
                curr=curr.left;
            }else{
                NodeClass temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data+" ");
                    while(!stack.isEmpty() && temp == stack.peek().right){
                       temp = stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }else curr=temp;
            }
        }
    }
}
