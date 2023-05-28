package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.*;

public class verticalOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(verticalTraversal(root));


    }

    static List<List<Integer>> verticalTraversal(TreeNode root) {

        List<Integer> subList = new ArrayList<>();

        Map<Integer, List<Integer> > map = new TreeMap<>();



        helper(root, 0,0,map,subList);




        List<List<Integer>>list = new ArrayList<>();
        return list;

    }

    static void helper(TreeNode root, int row , int col, Map<Integer,List<Integer>> map,List<Integer> subList){
        if(root.left == null && root.right == null ){
            List<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(col,list);
            return;
        }
        List<Integer> list = new ArrayList<>();
        //left
        if(root.left!= null){
            helper(root.left, row+1,col-1,map,subList);

            list.add(root.data);
            map.put(col,list);
        }if(root.right!= null) {


        //right
        helper(root.right,row+1,col+1,map,subList);

       if(!map.containsKey(col)){
           list.add(root.data);
           map.put(col,list);
       }

        }
//        subList.add(root.data);
//        map.put(col,subList);
//        row = row-1;
//        col = col-1;
    }
}
