package Stacks_Queues_Revision.KunalPracticeQues;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] arr = {13829};
        System.out.println(Arrays.toString(nextCircularGreater(arr)));

    }

    static int[] nextCircularGreater(int[] arr){
        // do push-pop operation from arr.length-2 till 0th index
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-2; i >= 0 ; i--) {
            if(!stack.isEmpty()){
                if(arr[i] >= stack.peek()){
                    while(!stack.isEmpty() && arr[i] > stack.peek()){
                        stack.pop();
                    }   stack.push(arr[i]);
                }else  stack.push(arr[i]);
            }else stack.push(arr[i]);
        }

        // now do as we did in NextGreaterNum1

        int[] ans = new int[arr.length];
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && arr[i] >= stack.peek()){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    ans[i] = stack.peek();
                }else{
                    ans[i] =-1;
                }
                stack.push(arr[i]);
            }else{// if the stack is empty
                stack.push(arr[i]);
                ans[i] = -1;

            }
        }


        return ans;
    }
}
