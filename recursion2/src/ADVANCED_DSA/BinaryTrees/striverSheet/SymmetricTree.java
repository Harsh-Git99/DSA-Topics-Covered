package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.*;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(2);
       // root.left.right = new TreeNode(3);

       // root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(2);

        System.out.println(height(root));

        System.out.println(isSymmetric(root));

        System.out.println(helper(root,root));

    }

    static boolean helper (TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.data != root2.data) return false;
        return helper(root1.left,root2.right) && helper(root1.right,root2.left);
    }

    static boolean isSymmetric(TreeNode root) {

        int height = height(root);

        Queue<TreeNode> q = new LinkedList<>();
       // TreeNode tempNull = new TreeNode(0);
        q.add(root);
        while (!q.isEmpty()){
            int len = q.size();

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < len; i++) {


                if(q.peek() == null || q.peek().left == null){
                    q.offer(null);

                }else q.offer(q.peek().left);

                if(q.peek() == null ||  q.peek().right == null){
                    q.offer(null);
                }else q.offer(q.peek().right);

                if(q.peek() == null){
                    list.add(Integer.MAX_VALUE);
                    q.poll();
                }else list.add(q.poll().data);
            }
            //check if the list is a palindrome

            int i = 0, j = list.size()-1;
            while (i < list.size()){
                if(!list.get(i).equals(list.get(j))){
                return false;
                }
                i++;
                j--;
            }height--;
            if(height ==0){
                break;
            }
        }
        return true;
    }

    static  int height (TreeNode node){
        if(node == null){
            return 0;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        return 1+Math.max(lh,rh);
    }




    //Works for non duplicate values in node
//    static boolean isSymmetric(TreeNode root) {
//        List<Integer> list = helper(root);
//
//
//        int i = 0, j = list.size()-1;
//
//        while (i < list.size()){
//            if(!list.get(i).equals(list.get(j))){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//
//    }
//
//    static List<Integer> helper (TreeNode node){
//        if(node == null && node == null){
//            List<Integer> list = new ArrayList<>();
//            list.add(Integer.MAX_VALUE);
//            return list;
//        }
//
//        List<Integer> list = new ArrayList<>();
//
//        list.addAll(helper(node.left));
//        list.add(node.data);
//        list.addAll(helper(node.right));
//        return list;
//
//    }
}
