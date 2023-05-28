package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class leadersInTheArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};

        System.out.println(findingLeaders1(arr));
    }

    //more optimized
    static ArrayList<Integer> findingLeaders1(int[]arr){
        int sum = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i] >= sum){
                sum = arr[i];
                list.add(sum);
            }
        }

        Collections.reverse(list);

        return list;
    }

    static ArrayList<Integer> findingLeaders(int[]arr){
        int sum = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i] >= sum){
                sum = arr[i];
                stack.push(sum);
            }
        }

        while (!stack.isEmpty()){
            list.add(stack.pop());
        }

        return list;
    }
}
