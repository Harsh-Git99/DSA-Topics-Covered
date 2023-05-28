package Stacks_Queues_Revision.KunalPracticeQues;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";

        System.out.println(removeAdjacent(s));
    }

    static  String removeAdjacent(String s){

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()){
               if(stack.peek() == ch){
                   stack.pop();
               }else stack.push(ch);
            }else stack.push(ch);
        }
       while(!stack.isEmpty()){
           sb.append(stack.pop());
       }

       return sb.reverse().toString();
    }
}
