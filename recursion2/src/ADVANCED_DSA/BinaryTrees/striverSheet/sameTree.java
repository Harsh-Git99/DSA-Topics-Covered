package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sameTree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(1);
       // root1.right = new TreeNode(3);


        TreeNode root2 = new TreeNode(1);
       // root2.left = new TreeNode(2);
        root2.right = new TreeNode(1);

        System.out.println(sameTree(root1,root2));


    }

    static boolean sameTree( TreeNode root1, TreeNode root2 ) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inOrder(root1,list1);
        inOrder(root2,list2);
        if(list1.size() != list2.size()) return false;
        for (int i = 0; i < list1.size(); i++) {
            if(!list1.get(i).equals(list2.get(i)) ){
                return false;
            }
        }
        return true;
    }

    static void inOrder(TreeNode node, List<Integer> ans){
        if(node == null){
            ans.add(Integer.MAX_VALUE);
            return;
        }
        inOrder(node.left,ans);
        ans.add(node.data);
        inOrder(node.right,ans);
    }
}
