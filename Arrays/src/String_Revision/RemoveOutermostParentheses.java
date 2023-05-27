package String_Revision;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";

        System.out.println(removeOuter(s));

    }

    static String removeOuter(String s){
        int open =0, close = 0, start = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                open++;
            }else if(s.charAt(i) == ')'){
                close++;
            }
            if(open == close){
                sb.append(s.substring(start+1, i));

                start = i+1;
            }
        }
        return sb.toString();
    }
}
