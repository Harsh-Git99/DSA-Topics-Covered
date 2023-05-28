package ADVANCED_DSA.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class ceilBST {
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

        System.out.println(findCeil(node,5));

    }

    static int findCeil(Node root, int key) {
        int ans = -1;
        while(root!= null){
            if(key > root.data){
                root = root.right;
            }else if (key <= root.data) {
                ans = root.data;
                root = root.left;
            }
        }
        return ans;
    }

    static List<Integer> findCeil2(Node root, int key) {
        if(root == null){
            List<Integer> list = new ArrayList<>();
            return list;
        }
        List<Integer> list = new ArrayList<>();
        if(root.data >= key) {
            list.add(root.data);
            if(root.data == key)return list;
        }
        list.addAll(key < root.data ? findCeil2(root.left,key): findCeil2(root.right,key));
        return list;
    }
}
