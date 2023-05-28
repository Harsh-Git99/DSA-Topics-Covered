package ADVANCED_DSA.BinaryTrees.striverSheet;

import ADVANCED_DSA.BinaryTrees.DFS_types.NodeClass;

import java.util.*;

public class MaxDepthOfTree_Iterative {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println( maxDepth(root));
    }

    static int maxDepth(TreeNode node){
        List<List<Integer>> wrapList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(node);
        while(!q.isEmpty()){
            int length = q.size();
            List<Integer> subList = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                if(q.peek().right != null)q.add(q.peek().right);
                if(q.peek().left != null)q.add(q.peek().left);

                subList.add(q.poll().data);
            }
            wrapList.add(subList);
        }
        return wrapList.size();
    }
}
