package Inbuilt.Questions;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {

        String str =  "(a*b)-(c*d)+(e/f)";

        System.out.println(infixToPostfix(str));


    }

    static StringBuilder infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder post = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != '^' && ch != '+' && ch != '-' && ch != '/' && ch != '*' && ch != '(' && ch != ')' ){
                 post.append(ch);
            }else{
                if(ch != ')'){
//                    '''
                    if(!stack.isEmpty()){
                        if((ch == '-' || ch == '+' || ch == '*' || ch == '/' || ch == '^' ) && stack.peek() == '^'){
                            post.append(stack.pop());

                        }
                        if((ch == '-' || ch == '+' || ch == '/' || ch == '*')  && (stack.peek() == '*' )){
                            post.append(stack.pop());

                        }
                        if((ch == '-' || ch == '+' || ch == '/')  && (stack.peek() == '/' )){
                            post.append(stack.pop());

                        }
                        if((ch == '-' || ch == '+' )  && (stack.peek() == '+' )){
                            post.append(stack.pop());

                        }
                        if((ch == '-'  )  && (stack.peek() == '-' )){
                            post.append(stack.pop());

                        }
                        stack.push(ch);

                    }else{
                        stack.push(ch);
                    }
                }else {
                    while(stack.peek() != '('){
                            post.append(stack.pop());
                        }
                    stack.pop();
                }

            }
        }
        while(!stack.isEmpty()){
            post.append(stack.pop());
        }
        return post;
    }
}
