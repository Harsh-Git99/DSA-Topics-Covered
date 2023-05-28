package ADVANCED_DSA.BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class BSTorNot {
    public static void main(String[] args) {

        Node root = new Node(2);

        root.left = new Node(2);
        root.right = new Node(2);

//        root.left.left = new Node(4);
//        root.left.right = new Node(5);

     //   root.left.right.left = new Node(6);

//        root.right.left = new Node(3);
//        root.right.right = new Node(6);

//        root.right.right.left = new Node(9);
//        root.right.right.right = new Node(10);

        System.out.println(isValidBST(root));



    }



    static boolean isValidBST(Node root){
        List<Integer> list = new ArrayList<>();

        TreeSet<Integer> set = new TreeSet<>();
        Node curr = root;
        while(curr != null){
            //case1
            if(curr.left == null){
                if(set.contains(curr.data))return false;
                else set.add(curr.data);
                list.add(curr.data);
                curr = curr.right;
            }else{
                Node prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }else{
                    prev.right = null;
                    if(set.contains(curr.data))return false;
                    else set.add(curr.data);
                    list.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        int i = 0;
        for (int values : set) {
           if(!list.get(i).equals(values)){
               return false;
           }i++;
        }
        return true;
    }
}
