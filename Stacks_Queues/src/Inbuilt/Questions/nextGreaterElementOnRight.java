package Inbuilt.Questions;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementOnRight {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreat_Stack(arr)));
    }


    static int[] nextGreat_Stack (int[] nums){
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[nums.length-1]);
        ans[ans.length-1] = -1;
        for (int i = nums.length-2; i >= 0 ; i--) {
            //-a+

            while(!stack.isEmpty() && nums[i] >= stack.peek() ){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();
            }

            stack.push(nums[i]);
        }
        return ans;
    }
}
