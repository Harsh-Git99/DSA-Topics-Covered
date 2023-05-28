package ADVANCED_DSA.BinarySearchTree;

import java.util.List;

public class deleteNodeBST {
    public static void main(String[] args) {
        Node node = new Node(5);

        node.left = new Node(3);
        node.right = new Node(6);

        node.left.left = new Node(2);
        node.left.right = new Node(4);

        node.right.right = new Node(7);

       // System.out.println(findCeiling(node,3).data);

        System.out.println(deleteNode(node,3));
    }


    static Node deleteNode(Node root, int val){

        Node node1 = root;
        Node node2 = root;
        Node node3 = root;

        //find Node with data = val

        Node deletingNode = findDeletingNode(node1,val);

        //find ceiling
        Node ceiling = findCeiling(node2,val);



        Node replace = findDeletingNode( node3 ,ceiling.data);
        replace = null;

        deletingNode.data = ceiling.data;


        inOrder(root);

        return root;

    }

     static Node findDeletingNode(Node node, int val) {
        Node ans = new Node(-1);

        while (node != null){
            if(val < node.data){
                node = node.left;
            } else if (val > node.data) {
                node=node.right;
            }
            if(node != null && node.data == val){
                ans = node;
                break;
            }
        }
        return ans;
    }


    //find the ceiling node
    static Node findCeiling (Node node, int val){
        Node ans = new Node(-1);

        while(node!= null){
            if(val < node.data){
                ans = node;
                node=node.left;
            }else if(val >= node.data){

                node= node.right;
            }
        }

        return ans;
    }


    static void inOrder(Node node){
        if(node == null)return ;

        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
}
