package String_Revision;

public class RotateString {
    public static void main(String[] args) {
        String input = "abcde";
        String goal = "cdeab";

        System.out.println(rotate(input,goal));

    }

    static boolean rotate(String s, String t){
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if(sb.toString().equals(t)){
                return true;
            }else{
                sb.append(sb.charAt(0));
                sb.deleteCharAt(0);
            }
        }
        return sb.toString().equals(t);
    }
}
