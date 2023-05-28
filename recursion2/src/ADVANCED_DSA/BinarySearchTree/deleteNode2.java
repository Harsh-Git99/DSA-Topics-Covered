package ADVANCED_DSA.BinarySearchTree;

import ADVANCED_DSA.BinaryTrees.DFS_types.NodeClass;

public class deleteNode2 {
    public static void main(String[] args) {
//        Node node = new Node(2);
//
//        node.left = new Node(1);
//        node.right = new Node(3);

        Node node = new Node(0);

//        node.left = new Node(5);
//        node.right = new Node(12);
//
//        node.left.left = new Node(2);
//        node.left.right = new Node(7);
//
//        node.right.right = new Node(13);
//        node.right.left = new Node(10);
//
//
//        node.left.left.left = new Node(1);
//        node.left.left.right = new Node(3);
//        node.left.left.right.right = new Node(4);
//
//        node.left.right.right = new Node(8);
//        node.left.right.left = new Node(6);


         //System.out.println(findMax(node).data);

       // System.out.println(deleteNode(node,3));

      //  System.out.println(findRootOfTargetNode(node,1).data);

        inOrder(node);

        System.out.println();
        Node result  = deleteNode(node,0);

        inOrder(result);



    }



    static Node deleteNode(Node root, int val){

        Node node = root;
        Node node1 = root;

        //findTargetNode
        Node targetNode = findNode(node,val);
        if(targetNode == null)return root;
        //find maxNode of subBST targetNode.left
        Node maxOfSubBST = null;
        if(targetNode.left != null) {
             maxOfSubBST = findMax(targetNode.left);
        }else{
            return targetNode.right;
        }

        if(root == targetNode){
            maxOfSubBST.right = root.right;
            return root.left;
        }

        maxOfSubBST.right = targetNode.right;

        //find root of the targetNode
        Node rootOfTargetNode = findRootOfTargetNode(node1, val);

        if(rootOfTargetNode.data > targetNode.left.data){
            rootOfTargetNode.left = targetNode.left;
        }else rootOfTargetNode.right = targetNode.left;
        return root;

    }

    //find root
     static Node findRootOfTargetNode(Node node, int val) {

        while(node != null){
            if((node.left!= null && node.left.data == val) || node.right!= null &&  node.right.data == val){
                return node;
            }
            if(val < node.data){
                node = node.left;
            }else if(val > node.data){
                node = node.right;
            }

        }
        return null;
    }

    //find the node to be deleted

    static Node findNode(Node node, int val){

        while(node!= null){
            if(val < node.data){
                node = node.left;
            }else if(val > node.data){
                node = node.right;
            }
            if(node != null && node.data == val){

                return node;
            }
        }
        return null;
    }


    //find max in subTree
    static Node findMax(Node node){
        if(node.left==null && node.right == null){
            return node;
        }

        if(node.right!= null){
            return findMax(node.right);
        }else return findMax(node.left);

    }

    static void inOrder(Node node){
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
}
