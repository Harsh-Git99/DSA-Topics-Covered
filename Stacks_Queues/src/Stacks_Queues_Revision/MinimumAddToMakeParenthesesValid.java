package Stacks_Queues_Revision;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String S = "())";
        System.out.println(MinAdd(S));
    }

    static  int MinAdd (String S){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if (ch == ')' && stack.peek() == '(') {
                stack.pop();
            }
            else stack.push(ch);
        }

        return stack.size();
    }
}
