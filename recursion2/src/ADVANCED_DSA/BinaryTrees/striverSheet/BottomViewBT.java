package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Tuple2{
     TreeNode root;
     int row;
     int col;
     public Tuple2(TreeNode node, int r, int c) {
         root = node;
         row = r;
         col = c;
     }
}

public class BottomViewBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);

//        root.left.right.left= new TreeNode(6);
//        root.left.right.left.left = new TreeNode(8);
//
//        root.right.left.left = new TreeNode(7);
//        root.right.left.left.left = new TreeNode(9);

        System.out.println(bottomView(root));
    }

    static ArrayList<Integer> bottomView(TreeNode root){

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Tuple2> queue = new LinkedList<Tuple2>();

        TreeMap<Integer,Integer>map = new TreeMap<>();

        queue.add(new Tuple2(root,0,0));

        while (!queue.isEmpty()){
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Tuple2 tuple = queue.peek();
                TreeNode node = tuple.root;

                int r = tuple.row;
                int c = tuple.col;

                if(node.left != null) queue.offer(new Tuple2(node.left,r+1,c-1));
                if(node.right != null) queue.offer(new Tuple2(node.right,r+1,c+1));

                if(!map.containsKey(tuple.col)){
                    map.put(tuple.col,tuple.root.data);
                }else if(map.containsKey(tuple.col)) {
                    map.replace(tuple.col, tuple.root.data );
                }
                queue.poll();
            }

        }

        for (int k : map.keySet()){
            list.add(map.get(k));
        }
        return list;
    }




//    static ArrayList<Integer> bottomView(TreeNode root)
//    {
//        // Code here
//
//        if(root.left == null && root.right == null){
//            ArrayList<Integer> list = new ArrayList<>();
//            list.add(root.data);
//            return list;
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//
//        if(root.left != null) list.addAll(bottomView(root.left));
//        if(root.right != null) list.addAll(bottomView(root.right));
//
//        return list;
//
//    }
}
