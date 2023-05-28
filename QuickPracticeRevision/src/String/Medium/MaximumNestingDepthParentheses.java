package String.Medium;

import java.util.Stack;

public class MaximumNestingDepthParentheses {
    public static void main(String[] args) {
        String s = "((8+7)*(3+9)-0)*(1*6)";
        String str  = s.replaceAll("[a-zA-Z0-9+--*/ ]","");
        System.out.println(str);
        System.out.println(countMax2(s));
    }


    static int countMax2(String str){
        String s = str.replaceAll("[a-zA-Z0-9+--*/ ]", "");
        int i = 0;
        int j = s.length()-1;
        int count = 0;
        while(i<=j){
            char chi = s.charAt(i);
            char chj = s.charAt(j);

            if(chi == '(' && chj == ')'){
                count++;
                i++;
                j--;
            }else if(chi == ')'  && chj == ')' ){
                i++;
            }else if(chi == '('  && chj == '(' ){
                j--;
            }else {
                i++;
                j--;
            }
        }
        return count;
    }


    static int countMax1 (String str) {
        String s = str.replaceAll("[a-zA-Z0-9+--*/ ]", "");
        Stack<Character> stack = new Stack<>();
        int count = 0, maxCount = 0;
        int j = 0;
        while(j < s.length()) {
            char ch = s.charAt(j);
            if(ch == '('){
                stack.push(ch);
                j++;
            } else if (ch == ')') {
                while(j < s.length() && s.charAt(j)!= '(' ){
                    stack.pop();
                    count++;
                    j++;
                }
                if(count > maxCount) {
                    maxCount = count;
                    count = 0;
                }
            }
        }
        if(stack.isEmpty())return maxCount;
        return maxCount+1;
    }




    static int countMax (String str){
        String s  = str.replaceAll("[a-zA-Z0-9+--*/ ]","");
        Stack<Character> stack = new Stack<>();
        int count = 0, maxCount = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            } else if (ch == ')') {
                 j =i ;
                while (j < s.length() && s.charAt(j) == ')' && !stack.isEmpty()){
                    stack.pop();
                    count++;
                    j++;
                }
                //j=j-1;

                if(count > maxCount) {
                    maxCount = count;
                    count = 0;
                    i = j-1;
                    if(j ==s.length()-1) return maxCount;
                }
            }
        }
        if(stack.size() >0){
            return maxCount+1;
        }
        return maxCount;
    }
}
