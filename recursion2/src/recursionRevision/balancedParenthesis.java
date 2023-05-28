package recursionRevision;

import java.util.Arrays;
import java.util.Stack;

public class balancedParenthesis {
    public static void main(String[] args) {
        String s = "{[((()))]}";
        //String s = "[(])";
        System.out.println( isBalancedRec(s));

        //System.out.println(isBalanced(s));


    }

    //using recursion

    static char findClosing(char ch){
        if(ch == '(') return ')';
        if(ch == '{') return '}';
        if(ch == '[') return ']';
        return Character.MAX_VALUE;
    }




    static boolean isBalancedRec(String s){

        if(s.length() == 0) return true;
        if(s.length() == 1) return false;
        char ch = s.charAt(0);
        if( ch == ')' || ch == '}'|| ch == ']'){
            return false;
        }

        char closing = findClosing(ch);
        int count=0;
        int i ;
        for (i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ch) count++;
            if(c == closing){
                if(count == 0) break;
                count--;
            }
        }

        if(i == s.length()){
            return false;
        }

        if(i == 1){
            return isBalancedRec(s.substring(i+1));
        }

        return isBalancedRec(s.substring(1,i)) && isBalancedRec(s.substring(i+1));


    }




    //using stacks
    static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if( stack.isEmpty() && (ch == ')' || ch == '}'|| ch == ']')){
                return false;
            }
            if(ch == '{' || ch == '(' ||ch == '[' ){
                stack.push(ch);
            } else if (ch == '}' && stack.peek() == '{' ) {
                stack.pop();
            }else if (ch == ')' && stack.peek() == '(' ) {
                stack.pop();
            }else if (ch == ']' && stack.peek() == '[' ) {
                stack.pop();
            }else return false;
        }
        return stack.isEmpty();
    }
}
