package ADVANCED_DSA.BinaryTrees.DFS_types;

import java.util.Stack;

public class postOrderIterative {

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

        postOrder(root);
    }

    static void postOrder(NodeClass node){
        Stack <NodeClass> s1 = new Stack<>();
        Stack <NodeClass> s2 = new Stack<>();
        s1.push(node);
        while(true){
            if(node != null) {
                s2.push(s1.pop());
                if (node.left != null) s1.push(node.left);
                if (node.right != null) s1.push(node.right);

                node = node.right;
            }
            else{
                   if(s1.isEmpty())break;
                   node = s1.peek();
               }
        }
        while(!s2.isEmpty()){
            System.out.print(s2.pop().data+" ");
        }


    }
}
