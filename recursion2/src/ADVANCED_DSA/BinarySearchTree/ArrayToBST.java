package ADVANCED_DSA.BinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToBST {
    public static void main(String[] args) {

      int[]  nums = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(sortedArrayToBST(nums)));
    }

    static int[] sortedArrayToBST(int[] nums)
    {
        // Code here

        Node root = constructBST(nums, 0, nums.length-1 );

        //preOrder

        List<Integer> list =  preOrder(root);



        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;


    }

    static Node constructBST(int[] nums, int st, int end ){

        if(st > end){
            return null;
        }

        int mid = (st+end)/2;


        Node node = new Node(nums[mid]);

        node.left = constructBST( nums , st, mid-1);

        node.right = constructBST(nums , mid+1, end);

        return node;

    }

    static List<Integer> preOrder(Node root){
        if(root.right == null && root.left == null){
            List<Integer > list = new ArrayList<>();
            list.add(root.data);
            return list;
        }

        List<Integer > list = new ArrayList<>();

        list.add(root.data);
        if(root.left!= null) list.addAll(preOrder(root.left));
        if(root.right!= null) list.addAll(preOrder(root.right));

        return list;
    }
}
