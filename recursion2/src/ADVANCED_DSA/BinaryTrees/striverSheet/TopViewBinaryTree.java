package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.*;

class Tuple1{
    TreeNode root;
    int row;
    int col;
    public Tuple1 (TreeNode node, int r, int c){
        root =node;

        row = r;
        col = c;


    }
}

public class TopViewBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        //root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
       // root.right.right = new TreeNode(4);

        root.left.right.left= new TreeNode(6);
        root.left.right.left.left = new TreeNode(8);

        root.right.left.left = new TreeNode(7);
        root.right.left.left.left = new TreeNode(9);

        System.out.println(topView(root));
    }

    static ArrayList<Integer> topView(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();

        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Tuple1> q = new LinkedList<Tuple1>();

        q.add(new Tuple1(root,0,0));

        while(!q.isEmpty()){
            int len = q.size();



           // Set<Integer> set = new HashSet<>();
            for (int i = 0; i < len; i++) {
                Tuple1 tuple = q.peek();
                TreeNode node = tuple.root;
                int r = tuple.row;
                int c = tuple.col;

                if(node.left != null) q.offer(new Tuple1(node.left,r+1,c-1));
                if(node.right != null) q.offer(new Tuple1(node.right,r+1,c+1));
                // set.add(q.peek().col);
                if(!map.containsKey(q.peek().col)){
                    map.put( q.peek().col, q.peek().root.data);
                }
                q.poll();
//                if(!q.isEmpty() ){
//                    node = q.peek().root;
//                }


            }
        }
        for(int k : map.keySet() ){
            list.add(map.get(k));
        }

        return list;


    }
}
