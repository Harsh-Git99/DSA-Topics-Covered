package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.ArrayList;

public class RootLeafPaths {
    public static void main(String[] args) {

        TreeNode node = new TreeNode(30);

        node.left = new TreeNode(9);


        node.left.left = new TreeNode(5);
        node.left.right = new TreeNode(6);

        node.left.left.left = new TreeNode(8);
        node.left.left.right = new TreeNode(9);


        node.right = new TreeNode(20);
        node.right.right = new TreeNode(7);
        node.right.left = new TreeNode(15);
        node.right.right.left = new TreeNode(6);
        node.right.left.left = new TreeNode(10);

        ArrayList<ArrayList<Integer>> wrapList = new ArrayList<>();
        ArrayList<Integer>list = new ArrayList<>();
        Paths(node,list,wrapList);
        System.out.println(wrapList);


    }


    static void Paths(TreeNode root,ArrayList<Integer>list, ArrayList<ArrayList<Integer>>wrapList ){


        list.add(root.data);
        if(root.left== null&&root.right== null ) {

           wrapList.add(new ArrayList<>(list));
           list.remove(list.size()-1);
           return;
        }if(root.left!= null)Paths(root.left,list,wrapList);

        if(root.right!= null)Paths(root.right,list,wrapList);
        list.remove(list.size()-1);
    }
}
