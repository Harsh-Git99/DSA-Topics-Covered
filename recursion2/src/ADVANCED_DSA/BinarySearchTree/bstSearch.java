package ADVANCED_DSA.BinarySearchTree;


import javax.swing.tree.TreeNode;

public class bstSearch {
    public static void main(String[] args) {
      Node node = new Node(8);

      node.left = new Node(3);
      node.right = new Node(10);

      node.left.left = new Node(1);
      node.left.right = new Node(6);

      node.left.right.right = new Node(7); //
      node.left.right.left = new Node(4);

      node.right.right = new Node(14);
      node.right.right.left = new Node(13);

        System.out.println(search(node,node.left.data ).data);

        System.out.println(  search2(node,node.left.data).data);

    }

    static Node search (Node node , int targetNodeData){
        while(node != null && node.data != targetNodeData){
            if(targetNodeData < node.data){
                node = node.left;
            }else node = node.right;
        }
        return node;
    }

    static Node search2 (Node node, int  targetNode){
        if(node == null){
            return null;
        }
        if(node.data == targetNode ){
            return node;
        }else{
            return targetNode < node.data ? search2(node.left, targetNode) : search2(node.right, targetNode);
        }
    }
}
