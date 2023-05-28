package Inbuilt.Questions;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {

        String s = "()))((";

        System.out.println( minAdd(s));
    }

    static int minAdd(String s){

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(stack.peek() == '(' && ch == ')'  ){
                stack.pop();
            }
            else stack.push(ch);
        }
        return stack.size();
    }
}
