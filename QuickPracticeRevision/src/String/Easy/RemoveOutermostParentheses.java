package String.Easy;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";

        System.out.println(removeOuter(s));
    }

    static String removeOuter(String s){

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(stack.size() > 0){
                    sb.append(ch);
                }
                stack.push(ch);
            }else {
                stack.pop();
                if(stack.size() > 0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
