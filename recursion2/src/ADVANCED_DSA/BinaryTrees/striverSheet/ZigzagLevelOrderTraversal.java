package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.*;

public class ZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(6);

        System.out.println(zigzagLevelOrder(root));

    }

    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> wrapList = new ArrayList<>();

        deque.add(root);
        int flag =0;
        while (!deque.isEmpty()){

            int levelNum = deque.size();
            List<Integer> sublist = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {

                if(deque.peek().left!= null) deque.offer(deque.peek().left);
                if(deque.peek().right!= null) deque.offer(deque.peek().right);


                sublist.add(deque.removeFirst().data);

            }
            if(flag ==0 ) {
                wrapList.add(sublist);
                flag=1;
            } else {
                Collections.reverse(sublist);
                wrapList.add(sublist);
                flag=0;
            }


        }
        return wrapList;
    }
}
