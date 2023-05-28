package Stacks_Queues_Revision;

import java.util.Stack;

public class MinimumInsertionsToBalanceParenthesesString {
    public static void main(String[] args) {
        String s = ")))))))";

        System.out.println(minAdd(s));
    }

    static int minAdd (String s){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        char [] chArr = s.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            if(chArr[i] == '('){
                stack.push(chArr[i]);
            } else if (chArr[i] == ')') {
                if(!stack.isEmpty() &&  i < chArr.length-1 && chArr[i+1] == ')' && stack.peek() == '('){
                    stack.pop();
                    i++;
                } else if (stack.isEmpty() &&i < chArr.length-1 &&  chArr[i+1] == ')') {
                    count++;
                    i++;
                } else if (i < chArr.length-1 &&  chArr[i+1] == ')') {
                    i++;
                    count++;
                } else if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    count++;
                }else{
                    count += 2;
                }
            }
        }
        while ( !stack.isEmpty() ){
            if(stack.pop() == '('){
                count+=2;
            }
        }
        return count;
    }
}
