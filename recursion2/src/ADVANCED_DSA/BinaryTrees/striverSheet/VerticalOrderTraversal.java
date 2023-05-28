package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.*;

class  Tuple {
    TreeNode node;
    int row;
    int col;

    public  Tuple(TreeNode _node, int _row, int _col){
        node = _node;
        row  = _row;
        col  = _col;
    }
}

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(verticalTraversalTraversal(root));
    }

    static boolean verticalTraversalTraversal(TreeNode root) {
        TreeMap<Integer, Map<Integer, List<Integer>>> map= new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();

        q.offer(new Tuple(root,0,0));

        while(!q.isEmpty()){

            Tuple tuple = q.poll();
            TreeNode node = tuple.node;

            int x = tuple.row;
            int y = tuple.col;

//            if(map.containsKey()){
//
//            }

        }

        return true;

    }


}
