package ADVANCED_DSA.BinaryTrees.DFS_types;

public class postOrder {
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
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
}
