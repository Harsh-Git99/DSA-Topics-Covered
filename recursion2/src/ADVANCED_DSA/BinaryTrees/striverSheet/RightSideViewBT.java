package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);

        //System.out.println(rightSideView(root));

        System.out.println(rightSideView1(root));
    }

    static List<Integer> rightSideView1 (TreeNode root){

        List<Integer> ansList = new ArrayList<>();

        rightSideView1Helper(root,ansList,0);

        return ansList;
    }

    static void rightSideView1Helper(TreeNode root, List<Integer> ansList,int depth){
        if(root == null) return;

        if(ansList.size() == depth){
            ansList.add(root.data);
        }

        rightSideView1Helper(root.right,ansList,depth+1);
        rightSideView1Helper(root.left,ansList,depth+1);
    }

    static List<Integer> rightSideView(TreeNode root) {

        List<Integer> ansList = new ArrayList<>();

        if(root==null)return ansList;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){

            List<Integer> list = new ArrayList<>();
            int len = queue.size();

            for (int i = 0; i < len; i++) {

                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);

                list.add(queue.poll().data);
            }

            ansList.add(list.get(list.size()-1));

        }

        return ansList;

    }

}
