package ADVANCED_DSA.BinarySearchTree;

import ADVANCED_DSA.BinaryTrees.striverSheet.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class mergeTwoBST {
    public static void main(String[] args) {
        Node node = new Node(5);

        node.left = new Node(3);
        node.right = new Node(6);

        node.left.left = new Node(2);
        node.left.right = new Node(4);

//        node.left.right.right = new TreeNode(7); //
//        node.left.right.left = new TreeNode(4);
//
//        node.right.right = new TreeNode(14);
//        node.right.right.left = new TreeNode(13);

        Node root = new Node(2);

        root.left = new Node(1);
        root.right = new Node(3);

        root.right.right = new Node(7);
        root.right.right.left = new Node(6);

        System.out.println(inOrderMorris(node));

      //  System.out.println(merge(root,node));
    }

    static List<Integer> merge(Node root1, Node root2){


        //generate inOrder for both
        List<Integer> list1 = inOrder(root1);
        List<Integer> list2 = inOrder(root2);
        int i = 0, j = 0, k = 0;
        List<Integer> ans = new ArrayList<>();
        while(i < list1.size() && j < list2.size() ){
            if(list1.get(i) <= list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }else {
                ans.add(list2.get(j));
                j++;
            }
        }
        // by this point

        while(i < list1.size()){
            ans.add(list1.get(i));
            i++;
        }
        while( j < list2.size()){
            ans.add(list2.get(j));
            j++;
        }

        return ans;
    }


    static List<Integer> inOrderMorris(Node node){
        Node curr = node;
        List<Integer> list = new ArrayList<>();
        while (curr != null){
            if(curr.left == null){
                list.add(curr.data);
                curr = curr.right;
            }else{
                Node prev = curr.left;
                while(prev.right!= null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }else {
                    prev.right = null;
                    list.add(curr.data);
                    curr = curr.right;
                }

            }
        }
        return list;
    }



    static  List<Integer> inOrder (Node node){
        if(node.right == null&& node.left == null){
            List<Integer>list = new ArrayList<>();
            list.add(node.data);
            return list;
        }
        List<Integer>list = new ArrayList<>();

        if(node.left != null) list.addAll( inOrder(node.left));
        list.add(node.data);
        if(node.right!=null) list.addAll( inOrder(node.right));

        return list;
    }




}
