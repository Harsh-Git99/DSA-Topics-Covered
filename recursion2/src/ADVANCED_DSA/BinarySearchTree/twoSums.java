package ADVANCED_DSA.BinarySearchTree;

import java.util.*;

public class twoSums {
    public static void main(String[] args) {
        Node node = new Node(2);
//        node.left = new Node(3);
        node.right = new Node(3);
//
//        node.left.left = new Node(2);
//        node.left.right = new Node(4);
//
//
//        node.right.right = new Node(7);


        //System.out.println(findTarget(node,9));

        System.out.println(findTarget1(node,6));
    }

    public static Set<Integer> set = new TreeSet<>();
    static boolean findTarget1(Node root, int k) {
        //Set<Integer> set = new TreeSet<>();
        if(root == null)return false;
        if(set.contains(k-root.data)) return true;
        set.add(root.data);
        if(findTarget1(root.left,k)) return true;
        if(findTarget1(root.right,k))return true;

        return false;
    }


    static boolean findTarget(Node root, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Node node = root;
        List<Integer> list = inorder(root);
        getMap(node,map);

        for(int i : map.keySet()){
            for (int j = 0; j < list.size(); j++) {
                if(i != list.get(j) && i + list.get(j) == k)return true;
            }
        }
        return false;
    }

    static List<Integer> inorder (Node node){
        if(node.left == null&& node.right == null){
           List<Integer> list = new ArrayList<>();
           list.add(node.data);
           return list;
        }
        List<Integer> list = new ArrayList<>();
        if(node.left!= null)list.addAll(inorder(node.left));
        list.add(node.data);
        if(node.right!= null)list.addAll(inorder(node.right));

        return list;

    }


    static void getMap(Node node,Map<Integer,Integer> map ){
        if(node.left == null&& node.right == null){
            //Map<Integer,Integer> map = new HashMap<>();
            if(!map.containsKey(node.data)){
                map.put(node.data,1);
            }
            return ;
        }

        if(node.left!= null)getMap(node.left,map);
        map.put(node.data,1);
        if(node.right!= null)getMap(node.right,map);

    }

}
