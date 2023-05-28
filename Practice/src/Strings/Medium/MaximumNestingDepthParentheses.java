package Strings.Medium;

import java.util.Stack;

public class MaximumNestingDepthParentheses {
    public static void main(String[] args) {
        String s  = "8*((1*(5+6))*(8/6))";
        System.out.println(maxDepth1(s));
        System.out.println(maxDepth2(s));


    }

   // optimised approach
    static  int maxDepth1(String s){
        int count = 0, max =0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                if(count>max){
                    max = count;
                }
            } else if (ch == ')') {
                count--;
            }
        }
        return max;
    }


    //works for 137 out of 167 cases
    static int maxDepth2(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0, max =0;
        char temp = '\u0000';
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()){
                if(stack.peek() == '(' &&  ch == ')'){
                    stack.pop();
                    count++;
                    temp = ch;
                    if(count>max){
                        max=count;
                    }
                } else if (temp == ')' &&  ch == '(') {
                    stack.push(ch);
                    temp = '\u0000';
                    count=0;


                } else if (stack.peek() == '(' &&  ch == '(') {
                    stack.push(ch);

                }
            }else{
                if(ch == '(' || ch == ')'){
                    stack.push(ch);
                    count =0;
                    }
                }

        }
        if(stack.isEmpty()){
            return max;
        }else
            return -1;
    }

}
