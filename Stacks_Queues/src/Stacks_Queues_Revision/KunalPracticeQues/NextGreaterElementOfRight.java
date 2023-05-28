package Stacks_Queues_Revision.KunalPracticeQues;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementOfRight {
    public static void main(String[] args) {
        long[] arr = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }

    //O(n) complexity
    static long[] nextGreater(long[] arr){
        Stack<Long> stack= new Stack<>();
        long[] ans = new long[arr.length];

        for (int i = arr.length-1; i >= 0 ; i--) {
             if (!stack.isEmpty()) {
                while(!stack.isEmpty()&& stack.peek() <= arr[i]){
                    stack.pop();
                }
                if(!stack.isEmpty() ){
                    ans[i] = stack.peek();
                }
                else {
                    ans[i] = -1;
                }
                stack.push(arr[i]);
            }else {
                 ans[i] = -1;
                 stack.push(arr[i]);
             }
        }
        return ans;
    }

}
