package ADVANCED_DSA.BinarySearchTree;

import ADVANCED_DSA.BinaryTrees.DFS_types.NodeClass;

public class kthSmallestElement_MorrisTraversal {
    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(3);
        node.right = new Node(6);
        node.left.left = new Node(2);
//
        node.left.right = new Node(4);
        node.left.left.left = new Node(1);
        System.out.println(kthSmallest(node,1));
    }

    static int kthSmallest(Node root, int k){
        int i = 0, result = -1;

        while(root != null){
            if(i == k)return result;
            if(root.left == null){
                result = root.data;
                root = root.right;
                i++;
            }else {
                Node prev = root.left;
                while (prev.right!= null && prev.right != root){
                    prev =prev.right;
                }
                if(prev.right == null){
                    prev.right = root;
                    root = root.left;
                }else{
                    prev.right = null;
                    result = root.data;
                    root = root.right;
                    i++;
                }
            }
        }
        return result;
    }
}
