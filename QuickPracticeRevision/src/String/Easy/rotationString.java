package String.Easy;

public class rotationString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        System.out.println(isRotation(s, goal));
    }

    //most optimised
    static boolean isRotation(String s, String goal){
        StringBuilder sb  = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append(ch);
            if( sb.substring(i+1,sb.length()).equals(goal)){
                 return true;
            }
        }
        return false;
    }
}
