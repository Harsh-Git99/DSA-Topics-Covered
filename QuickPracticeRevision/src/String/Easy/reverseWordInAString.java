package String.Easy;

import java.util.Arrays;
import java.util.Stack;

public class reverseWordInAString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";


        System.out.println(reverse2(s));
    }


    //optimized

    static String reverse2 (String s ){
        String[] a = s.trim().split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = a.length-1;i >= 0 ; i--) {
            sb.append(a[i] + ".");
        }
        return sb.toString();
    }

    static String reverse (String s){
        String str = s.trim();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0 ; i--) {
            char ch = str.charAt(i);

            if(ch != '.'){
                stack.push(ch);
            }else{
                while (stack.size() > 0){
                    sb.append(stack.pop());

                }
                sb.append(".");
            }
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
