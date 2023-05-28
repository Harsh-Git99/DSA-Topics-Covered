package Strings;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {

        String s = "(()())(())";
        System.out.println(removeParens(s));

        //More optimized
        System.out.println(removeOuterParentheses(s));
    }
    static String removeParens(String S){
        StringBuilder sb = new StringBuilder();
        int open = 0, close =0,  start =0;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)== '('){

                open++;
            }
            else if (S.charAt(i)== ')'){
                close++;
            }
            if(open==close){
                sb.append(S.substring(start+1, i));     //here a substring is created from index start+1 till i(not including i) so that the first and last parentheses are ignored.
                start=i+1;      //here start value is updated to i+1(where i is the index of last parentheses of last subString
            }

        }
        return  sb.toString();
    }

    static String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count != 0){
                    sb.append(ch);
                }
                count++;
            }
            else{
                count--;
                if(count != 0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
