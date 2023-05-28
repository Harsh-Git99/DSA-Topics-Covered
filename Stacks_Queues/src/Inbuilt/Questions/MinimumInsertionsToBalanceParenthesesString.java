package Inbuilt.Questions;

import java.util.Stack;

public class MinimumInsertionsToBalanceParenthesesString {
    public static void main(String[] args) {

        String s = ")))))))";

        System.out.println(minInsertion(s));

    }

    static int minInsertion (String s ){

        Stack<Character> stack = new Stack<>();
        int count = 0;
        char[] ch = s.toCharArray();

        for (int i = 0; i <= ch.length-1; i++) {
            if(ch[i] == '('){
                stack.push(ch[i]);
            }
            else if(ch[i] == ')'){
                if(i < ch.length-1 && ch[i+1] == ')'){
                    if(!stack.isEmpty()){
                        stack.pop();
                        i=i+1;
                    }else {
                        count++;
                        i = i + 1;
                    }
                }else {
                    if(!stack.isEmpty()){
                        stack.pop();
                        count++;
                    }else{
                        count = count+2;
                    }

                }
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek() == '('){
                count = count+2;
                stack.pop();
            }
        }

        return count;
    }
}
