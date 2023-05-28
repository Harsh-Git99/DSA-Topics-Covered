package Inbuilt.Questions;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement02 {
    public static void main(String[] args) {
        int[] arr = {3,8,4,1,2};

        System.out.println(Arrays.toString(ngtStackIndex(arr)));
    }


    static int[] ngtStackIndex(int[] arr){
        int[] ans = new int[arr.length];

        Stack<Integer> stack  = new Stack<>();

        for(int i = 2* arr.length-1; i >= 0 ; i--){
            while(!stack.isEmpty() && (arr[stack.peek()] <= arr[i % arr.length])){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i%arr.length] = -1;
            }else {
                ans[i%arr.length] = arr[stack.peek()];
            }
            stack.push(i%arr.length);
        }
        return  ans;
    }




    //using stack

    static int[] ngeStack(int[] arr){

        int[] ans =  new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[arr.length-1]);
        ans[ans.length-1] = -1;

        for (int i = arr.length-2; i >=0 ; i--) {
            //-a+

            while(!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            //-a+

            while(!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }



    //optimized brute force
    static int[] nextGreater(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            ans[i] = -1;
            for (int j = 1; j < arr.length; j++) {

                if(arr[i] < arr[(i+j)%arr.length]){
                    ans[i] = arr[(i+j)%arr.length];
                    break;
                }
            }
        }
        return  ans;
    }
}
