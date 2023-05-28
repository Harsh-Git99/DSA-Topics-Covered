package ADVANCED_DSA.BinaryTrees.striverSheet;

import ADVANCED_DSA.BinarySearchTree.Node;
import ADVANCED_DSA.BinaryTrees.BFS_types.NodeClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class maxWidthBT {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);

        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(7);

        System.out.println(widthOfBinaryTree(root));
    }

    static int widthOfBinaryTree(TreeNode root) {
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();

            List<TreeNode> subList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if(q.peek() == null){
                    q.offer(null);
                    q.offer(null);
                    subList.add(q.poll());
                    continue;
                }


                if( (q.peek().left == null && q.peek().right==null) ){
                    subList.add(q.poll());
                    continue;
                }



                if(q.peek().left != null) {
                    q.offer(q.peek().left);

                    if ( q.peek().right==null) q.offer(null);

                }
                 if (q.peek().right!=null){
                    q.offer(q.peek().right);

                    if ( q.peek().left == null) q.offer(null);
                }

                subList.add(q.poll());
            }
            max = Math.max(max,subList.size());
        }

        return max;
    }

}
