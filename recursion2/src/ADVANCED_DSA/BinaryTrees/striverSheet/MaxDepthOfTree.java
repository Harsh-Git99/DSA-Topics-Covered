package ADVANCED_DSA.BinaryTrees.striverSheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaxDepthOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println( maxDepth(root));
        System.out.println(maxDepthStriver(root));

    }

    static int maxDepthStriver(TreeNode node) {

        if(node ==null)return 0;

        int lh = maxDepthStriver(node.left);
        int rh = maxDepthStriver(node.right);

        return 1+Math.max(lh,rh);
    }

    static int maxDepth(TreeNode node){

        if(node == null) return 0;

        //for 100% optimised code
        int max = maxDepthHelper(node,Integer.MIN_VALUE,0);

        //for less optimised code
        List<Integer> list = maxDepthHelper1(node,Integer.MIN_VALUE,0);

        return max;

    }

    static List<Integer> maxDepthHelper1(TreeNode node, int maxCount, int count){
       if(node == null){
           if(count > maxCount){
               maxCount = count;
           }
           count=0;
           List<Integer> list = new ArrayList<>();
           list.add(maxCount);
           return list;

       }
        List<Integer> list = new ArrayList<>();
       list.addAll((maxDepthHelper1(node.left, maxCount, count+1)));
        list.addAll((maxDepthHelper1(node.right, maxCount, count+1)));

        return list;

    }


    static int maxDepthHelper(TreeNode node, int maxCount, int count){
        if(node == null){
            if(count > maxCount){
                maxCount = count;
            }
            count=0;
            return maxCount;

        }
        int max1 =   maxDepthHelper(node.left, maxCount, count+1);
        int max2 = maxDepthHelper(node.right, maxCount, count+1);

        if(max1>max2)return max1;
        return max2;

    }
}

