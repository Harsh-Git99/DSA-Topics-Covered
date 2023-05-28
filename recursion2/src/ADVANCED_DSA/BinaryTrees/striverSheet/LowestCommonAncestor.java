package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-1);

        root.left = new TreeNode(0);
        root.right = new TreeNode(3);
//
        root.left.left = new TreeNode(-2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(8);
//
//        root.left.right.left = new TreeNode(7);
//        root.left.right.right = new TreeNode(4);
//
//
//        root.right.left = new TreeNode(0);
//        root.right.right = new TreeNode(8);

       System.out.println(lowestCommon(root, root.left.left.left, root.left));

//        ArrayList<TreeNode> subList = new ArrayList<>();
//        ArrayList<TreeNode> list = new ArrayList<>();
//        findLCA(root,root.left.right , subList,list);
//
//        System.out.println(list);

    }

    static int lowestCommon(TreeNode root, TreeNode p, TreeNode q) {
        if(p == root || q ==root)return root.data;

        ArrayList<TreeNode> subList = new ArrayList<>();
        ArrayList<TreeNode> list = new ArrayList<>();
        findLCA(root,p , subList,list);

        ArrayList<TreeNode> subList2 = new ArrayList<>();
        ArrayList<TreeNode> list2 = new ArrayList<>();
        findLCA(root,q , subList2,list2);

        int size = Math.max(list.size(),list2.size());

        for (int i = 0; i < size; i++) {
            if(i == list.size() || i == list2.size()){
                return list.get(i-1).data;
            }
            if((list.get(i)).data != (list2.get(i)).data){
                return list.get(i-1).data;
            }
        }

//        if(list.size() < list2.size() ) {
//            return list.get(list.size()-1).data;
//        }
        return list2.get(list2.size()-1).data;


    }


    static int lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(p == root || q ==root)return root.data;

        ArrayList<TreeNode> subList = new ArrayList<>();
        ArrayList<ArrayList<TreeNode>> list = new ArrayList<>();


        //findLCA(root,p,subList,list);


        ArrayList<TreeNode> subList2 = new ArrayList<>();
        ArrayList<ArrayList<TreeNode>> list2 = new ArrayList<>();

        //findLCA(root,q,subList2,list2);

        //System.out.println((list.get(0).get(0)).data);

        int size = Math.min(list.get(0).size(),list2.get(0).size());


        for (int i = 0; i < size; i++) {
            if((list.get(0).get(i)).data != (list2.get(0).get(i)).data){
                return list.get(0).get(i-1).data;
            }
        }

        if(list.get(0).size() < list2.get(0).size() ) {
           return list.get(0).get(list.get(0).size()-1).data;
        }
        return list2.get(0).get(list2.get(0).size()-1).data;


    }


    static void findLCA(TreeNode node,TreeNode p ,ArrayList<TreeNode> subList,ArrayList<TreeNode> list  ){
        subList.add(node);
        if(node == p ){
            for (int i = 0; i < subList.size(); i++) {
                list.add(subList.get(i));
            }
//            list.add(new ArrayList<>(subList));
//            subList.remove(subList.size()-1);
        }

//        if(node == null){
//            subList.remove(subList.size()-1);
//            return;
//        }

        if(node.left != null) findLCA(node.left,p,subList,list);
        if(node.right != null) findLCA(node.right,p,subList,list);

        subList.remove(subList.size()-1);
    }
}
