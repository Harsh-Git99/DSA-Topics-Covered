package striverSheetRecursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(generateParenthesis(n));
    }

    static List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();
        helper(list, "", 0,0,n,2*n);

        return list;
    }

    static void helper(List<String> list, String s, int open , int close,int n, int max){

       //if the parentheses starts with close bracket
        if(s.length() > 0&& s.charAt(0) == ')')return;

        //if the parentheses closes with open bracket
        if(s.length() == max && s.charAt(s.length()-1) == '(' ){
            return;
        }
        if(open+1 == close && s.charAt(s.length()-1) == ')') return;


        // s is of size 2*n
        if(s.length() == max && open == n && close == n ){
            list.add(s);
            return;
        }


        if(open > n) return;
        helper(list,s+'(',open+1,close,n,max);


        if(close> n) return;
        helper(list,s+')',open,close+1,n,max);
    }
}
